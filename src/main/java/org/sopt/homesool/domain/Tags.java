package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Tags implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alcoholId", nullable = false, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    Alcohol alcohol;

    @Column(nullable = false)
    private boolean newProduct;

    @Column(nullable = false)
    private boolean best;

    @Column(nullable = false)
    private boolean recommmend;

    private Tags(Alcohol alcohol, boolean newProduct, boolean best, boolean recommmend) {
        this.alcohol = alcohol;
        this.newProduct = newProduct;
        this.best = best;
        this.recommmend = recommmend;
    }

    public static Tags newInstance(Alcohol alcohol, boolean newProduct, boolean best, boolean recommmend) {
        return new Tags(alcohol, newProduct, best, recommmend);
    }
}
