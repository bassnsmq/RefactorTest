package demanadthree.iftandformsswitch;

/**
 *  有最终else 和 无最终else
 *  == 可以和 equals混用
 * */
public class NoHaveElse {
    /**
     * 无最终else
     * 最终效果
     * switch (code) {
     *             case "1":
     *                 System.out.println(code);
     *                 break;
     *             case "2":
     *                 System.out.println(code);
     *                 break;
     *             case "3":
     *                 System.out.println(code);
     *                 break;
     *             case "4":
     *                 System.out.println(code);
     *                 break;
     *             case "5":
     *                 System.out.println(code);
     *                 break;
     *         }
     *
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
     * 最终效果
     *  switch (code) {
     *             case "1":
     *                 System.out.println(code);
     *                 break;
     *             case "2":
     *                 System.out.println(code);
     *                 break;
     *             case "3":
     *                 System.out.println(code);
     *                 break;
     *             case "4":
     *                 System.out.println(code);
     *                 break;
     *             case "5":
     *                 System.out.println(code);
     *                 break;
     *             default:
     *                 System.out.println("嘤嘤嘤");
     *                 break;
     *         }
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
        /**
         * test2 重构结果
         * */

    }
}
