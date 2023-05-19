package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    private String nickName;

    @Column(nullable = false)
    private Rank userRank;

    @Column(nullable = false)
    private int point;

    @Column(nullable = false)
    private int coupon;

    @Column(nullable = false)
    private int interest;

    @Column(nullable = false)
    private int waiting;

    @Column(nullable = false)
    private int finish;

    @Column(nullable = false)
    private int ready;

    @Column(nullable = false)
    private int delivering;

    @Column(nullable = false)
    private int delivered;

    @Column(nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String phoneNumber;

    public void updateWaiting(){
        this.waiting += 1;
    }
}
