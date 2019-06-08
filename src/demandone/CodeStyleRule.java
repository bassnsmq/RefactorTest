package demandone;

/**
 *  未使用的导入
 * */
import java.awt.geom.QuadCurve2D;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.zip.ZipEntry;

public class CodeStyleRule {
    private long aLong = 2l;
    private String args[] = new String[10];
    /**
     * 格式修复
     */
    public void code1(int index) {
        if(index==100)
            System.out.println("index == 100");
        else
            System.out.println("index != 100");

        for(int i=0;i<100;i++)
            System.out.println(i);

        int i =0;
        while (i<100)
            i++;

    }
}


/**
 * 对于覆写的方法必须加@Override注释
 */
interface Test {
    void run();
}

class Test1 {
    public void runTest1() {

    }
}

class Test2 extends Test1 implements Test {

    public void run() {

    }

    public void runTest1() {
        super.runTest1();
    }
}
