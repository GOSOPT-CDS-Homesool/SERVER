package org.sopt.homesool.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class NewProduct implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "alcoholId", nullable = false, foreignKey = @ForeignKey(ConstraintMode.CONSTRAINT))
    Alcohol alcohol;

    @Column(nullable = false)
    private boolean popUp;
}
