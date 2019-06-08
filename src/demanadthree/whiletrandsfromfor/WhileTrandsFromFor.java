package demanadthree.whiletrandsfromfor;

import java.io.File;

/**
 * while转换为for
 */
public class WhileTrandsFromFor {
    private void test1() {
        int i = 0;
        int b = 0;
        int c = 0;
        File file = new File("xxx");
        while (i < 100 && b < 100) {
            run();
            i++;
            b++;
        }
    }

    private void test2() {
        int i = 0;
        int b = 0;
        i++;
        while (i < 100 && b < 100) {
            run();
            i++;
            b++;
        }
    }

    private void run() {
        
    }

}
