package demanadthree.iftandformsswitch;

/**
 *  有最终else 和 无最终else
 *  == 可以和 equals混用
 * */
public class NoHaveElse {
    /**
     * 无最终else
     * */
    public void test1(String code){
        if(code.equals("1")){
            /**
             * 模拟if then语句块执行代码
             * */
            System.out.println(code);
        }else if(code=="2"){
            System.out.println(code);
        }else if(code=="3"){
            System.out.println(code);
        }else if(code=="4"){
            System.out.println(code);
        }else if(code.equals("5")){
            System.out.println(code);
        }

    }

    /**
     * 有最终else
     * */
    public void test2(String code){
        if(code.equals("1")){
            /**
             * 模拟if then语句块执行代码
             * */
            System.out.println(code);
        }else if(code=="2"){
            System.out.println(code);
        }else if(code=="3"){
            System.out.println(code);
        }else if(code=="4"){
            System.out.println(code);
        }else if(code.equals("5")){
            System.out.println(code);
        }else{
            System.out.println("嘤嘤嘤");
        }

    }
}
