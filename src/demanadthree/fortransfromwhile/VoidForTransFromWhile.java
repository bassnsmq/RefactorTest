package demanadthree.fortransfromwhile;

/**
 * for 转换为 while
 */
public class VoidForTransFromWhile {

    private void test1() {
        for (int code; ; ) {
            /**
             * 模拟run
             * */
            run();
        }
    }

    private void test2(){
        for(;isRun();){
            run();
        }
    }

    private void test3(){
        for(;;){
            run();
        }
    }

    private void test4(){
        int code = 0;
        for(;;code++){
            run();
        }
    }

    private boolean isRun(){
        //xxxx
        return true;
    }

    private void run(){

    }
}
