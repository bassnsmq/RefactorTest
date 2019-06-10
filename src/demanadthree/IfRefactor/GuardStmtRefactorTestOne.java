package demanadthree.IfRefactor;

/**
 * 卫语句重构 去else
 */
public class GuardStmtRefactorTestOne {
    /**
     * 带返回值
     */
    double getPayAmount() {
        double result;
        if (_isDead()) {
            result = deadAmout();
        } else {
            if (_isSeparated()) {
                result = separatedAmount();
            } else {
                if (_isRetired()) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }
        return result;
    }

    /**
     *  无返回值
     * */
    private void test2(){
        if(isInHome()){
            System.out.println("在家");
            if(isSleep()){
                System.out.println("在睡觉");
            }else{
                System.out.println("不知道在干嘛");
            }
        }else if(isInCompany()){
            System.out.println("在公司");
            if(isWork()){
                System.out.println("在工作");
            }else{
                System.out.println("在开小差");
            }
        }else{
            System.out.println("不知道在哪");
        }
    }


    private boolean isDrink() {
        return false;
    }

    private boolean isInPart() {
        return false;
    }

    private boolean isInCar() {
        return false;
    }

    private boolean isToChatWith() {
        return false;
    }

    private boolean isWork() {
        return false;
    }

    private boolean isSleep() {
        return false;
    }

    private boolean isInCompany() {
        return false;
    }


    private boolean isEatBreakfast() {
        return false;
    }

    private boolean isInHome() {
        return false;
    }


    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private boolean _isRetired() {
        return false;
    }

    private double separatedAmount() {
        return 0;
    }

    private boolean _isSeparated() {
        return false;
    }

    private double deadAmout() {
        return 0;
    }

    private boolean _isDead() {
        return false;
    }
}
