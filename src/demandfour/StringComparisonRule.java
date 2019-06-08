package demandfour;

public class StringComparisonRule {
    public  void test(){
        String test = "test";
        if(test == "test"){
            run();
        }

        if(test.equals("test")){
            run();
        }
    }

    private  void run() {
    }
}
