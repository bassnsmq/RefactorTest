package demanadthree.fortransfromwhile;

public class VoidForRefactor {
    public void test() {
        T:
        for (; ; ) {
            Q:for (int code = 0; code > 100; ) {
                code++;
                if(code==50){
                    break T;
                }
            }
        }
    }
}
