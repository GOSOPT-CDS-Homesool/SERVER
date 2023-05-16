package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alcoholId", referencedColumnName = "id")
    Alcohol alcohol;

    @Column(length = 31, nullable = false)
    private String title;

    @Column(length = 127, nullable = false)
    private String image;

    @Column(length = 255, nullable = false)
    private String contents;

    @Column(nullable = false)
    private int star;

    @Column(nullable = false)
    private Date date;
}
