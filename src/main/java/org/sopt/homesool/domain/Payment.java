package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alcoholId", nullable = false,
            foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT), referencedColumnName = "id")
    Alcohol alcohol;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false,
            foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT), referencedColumnName = "id")
    User user;

    public Payment(Alcohol alcohol, User user) {
        this.alcohol = alcohol;
        this.user = user;
    }
}
