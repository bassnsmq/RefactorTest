# if转switch规则
### 重构规则
大量相同条件分支转换为switch更加的高效

if-else 语句层次达到4层 并且if语句中的condition中 
有一个条件语句是重复的并且与if的数量相等，
其余条件不重复且类型相等



实例:

查找的if语句

    '''
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
    ''' 

重构后:
    
    '''
    switch (code) {
          case 1:
                //以打印语句模拟if中的语句 if code==1 run
                System.out.println(code);
                break;
          case 2:
                System.out.println(code);
                break;
          case 3:
                System.out.println(code);
                break;
          case 4:
                System.out.println(code);
                break;
          case 5:
                System.out.println(code);
                break;
          case 6:
                System.out.println(code);
                break;
          case 7:
                System.out.println(code);
                break;
          default:
                System.out.println(100);
                break;
            }
    '''    
 