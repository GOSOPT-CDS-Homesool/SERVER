package org.sopt.homesool.common;

public class PriceUtil {
    public static String addCommaToPrice(int price){
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(price));
        sb.insert(sb.length() - 3, ",");

        return sb.toString();
    }
}
