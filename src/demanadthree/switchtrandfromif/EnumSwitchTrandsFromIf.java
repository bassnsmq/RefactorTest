package demanadthree.switchtrandfromif;

import demanadthree.iftandformsswitch.EnumClass;
import demanadthree.iftandformsswitch.EnumT;

/**
 * condition 为枚举类型
 */
public class EnumSwitchTrandsFromIf {
    private EnumT.Colour colour;
    private EnumClass enumClass;

    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    private Season spring = Season.SPRING;

    private void test() {
        switch (colour) {
            case RED:
                System.out.println("red");
                break;
            case BLUE:
                System.out.println("blue");
                break;
            default:
                System.out.println("none");
        }
    }

    private void test2() {
        switch (enumClass) {
            case IN:
                System.out.println("IN");
                break;
            case ERROR:
                System.out.println("Error");
                break;
        }
    }

    private void test3() {
        switch (spring) {
            case AUTUMN:
                System.out.println("秋天");
                break;
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
        }
    }
}
