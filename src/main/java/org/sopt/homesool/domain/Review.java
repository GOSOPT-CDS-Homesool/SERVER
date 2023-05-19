package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alcoholId", nullable = false, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
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
    private LocalDate date;
}
