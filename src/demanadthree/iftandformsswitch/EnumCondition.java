package demanadthree.iftandformsswitch;

/**
 * 对 枚举变量重构
 * */
public class EnumCondition {
    enum Season{
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    //类变量
    Season spring = Season.SPRING;
    //外部类变量
    EnumT.Colour red = EnumT.Colour.RED;
    //枚举类
    EnumClass enumClass = EnumClass.DELETE;


    /**
     * 内部
     * */
    public void test1(){
        if(spring.equals(Season.SPRING)){
            System.out.println("Spring");
        }else if(spring.equals(Season.SUMMER)){
            System.out.println("SUMMER");
        }else if(spring.equals(Season.AUTUMN)){
            System.out.println("AUTUMN");
        }else if(spring.equals(Season.WINTER))  {
            System.out.println("WINTER");
        }else{
            System.out.println("null");
        }
    }




    /**
     * 外部变量内
     * 正确
     * public void test2() {
     *         switch (red) {
     *             case RED:
     *                 System.out.println("red");
     *                 break;
     *             case BLUE:
     *                 System.out.println("blue");
     *                 break;
     *             case BLANK:
     *                 System.out.println("blank");
     *                 break;
     *             case YELLOW:
     *                 System.out.println("yellow");
     *                 break;
     *             case GREEN:
     *                 System.out.println("green");
     *                 break;
     *         }
     *     }
     * */

    public void test2(){
        if(red == EnumT.Colour.RED){
            System.out.println("red");
        } else if(red == EnumT.Colour.BLUE){
            System.out.println("blue");
        }else if(red == EnumT.Colour.BLANK){
            System.out.println("blank");
        }else if(red == EnumT.Colour.YELLOW){
            System.out.println("yellow");
        }else if(red == EnumT.Colour.GREEN){
            System.out.println("green");
        }
    }




    /**
     * 枚举类
     * /*** 正确
     *     public void test3() {
     *         switch (enumClass) {
     *             case DELETE:
     *                 System.out.println("DELETE");
     *                 break;
     *             case UPDATE:
     *                 System.out.println("UPDATE");
     *                 break;
     *             case ERROR:
     *                 System.out.println("ERROR");
     *                 break;
     *             case IN:
     *                 System.out.println("IN");
     *                 break;
     *             case OUT:
     *                 System.out.println("OUT");
     *                 break;
     *             case QUT:
     *                 System.out.println("QUT");
     *                 break;
     *         }
     *     }
     * */

    public void test3(){
        if(enumClass==EnumClass.DELETE){
            System.out.println("DELETE");
        }else if(enumClass==EnumClass.UPDATE){
            System.out.println("UPDATE");
        }else if(enumClass==EnumClass.ERROR){
            System.out.println("ERROR");
        }else if(enumClass==EnumClass.IN){
            System.out.println("IN");
        }else if(enumClass==EnumClass.OUT){
            System.out.println("OUT");
        }else if(enumClass==EnumClass.QUT){
            System.out.println("QUT");
        }
    }
}
