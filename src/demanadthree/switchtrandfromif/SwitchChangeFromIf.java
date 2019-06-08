package demanadthree.switchtrandfromif;

/**
 * 有break 语句 和 无break语句
 */
public class SwitchChangeFromIf {
    /**
     * 重构结果
     * if (code == 1) {
     * System.out.println(code);
     * } else if (code == 2) {
     * System.out.println(code);
     * } else {
     * System.out.println(code);
     * }
     */
    private void test1(int code) {
        switch (code) {
            case 1:
                /**
                 * 模拟执行方法
                 * */
                System.out.println(code);
                break;
            case 2:
                System.out.println(code);
                break;
            default:
                System.out.println(code);
        }
    }

    /**
     * 部分无break
     * */
    private void test2(int code){
        switch (code){
            case 1:
                System.out.println(code);
            case 2:
                System.out.println(code);
            case 3:
                System.out.println(code);
                break;
            default:
                System.out.println(code);
        }
    }

    /**
     * 无默认值
     * */
    private void test3(int code){
        switch (code){
            case 1:
                System.out.println(code);
                break;
            case 2:
                System.out.println(code);
                break;
            case 3:
                System.out.println(code);
                break;
        }
    }
}
