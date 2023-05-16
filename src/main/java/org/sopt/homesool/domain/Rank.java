package org.sopt.homesool.domain;

public enum Rank {
    BRONZE,
    SILVER,
    GOLD;

    @Override
    public String toString() {
        if(this.equals(Rank.BRONZE))
            return "브론즈";
        else if(this.equals(Rank.SILVER))
            return "실버";
        else if(this.equals(Rank.GOLD))
            return "골드";
        return null;
    }
}
