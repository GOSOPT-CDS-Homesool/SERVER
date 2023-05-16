package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductInquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alcoholId", referencedColumnName = "id")
    Alcohol alcohol;

    @Column(nullable = false)
    private Date date;

    @Column(length = 255, nullable = false)
    private String contents;

    @Column(length = 255, nullable = false)
    private String answer;
}
