package org.sopt.homesool.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Alcohol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 127, nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean soldOut;

    @Column(nullable = false)
    private boolean isLike;

    @Column(nullable = false)
    private int sale;

    @Column(nullable = false)
    private int price;

    @Column(length = 127, nullable = false)
    private String image;

    @Column(length = 127, nullable = false)
    private String detailImage;

    @Column(length = 127, nullable = false)
    private String imageInfoImage;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false)
    private boolean subscribe;

    @Column(nullable = false)
    private boolean twinkle;

    public void updateStock(){
        this.stock -= 1;
    }

    public void setSoldOut(boolean isSoldOut){
        this.soldOut = isSoldOut;
    }

    public void setLike(boolean isLike) { this.isLike = isLike; }
}
