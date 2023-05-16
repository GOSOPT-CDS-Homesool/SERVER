package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(NewProduct.class)
public class Tags implements Serializable {
    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "alcoholId", referencedColumnName = "id")
    Alcohol alcohol;

    @Column(nullable = false)
    private boolean newProduct;

    @Column(nullable = false)
    private boolean best;

    @Column(nullable = false)
    private boolean recommmend;
}
