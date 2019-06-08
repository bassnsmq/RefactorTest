# switch转if规则
### 重构规则 
低于3层case 的switc是低效的 建议转换为if语句


示例:

查找的switch语句 
    
    '''
    switch (code) {
          case 1:
              System.out.println(code);
              break;
          case 2:
              System.out.println(code);
              break;
          default:
              System.out.println(code);
          }
    '''


重构后:
    
    '''
    if (code == 1) {
          System.out.println(code);
       } else if (code == 2) {
          System.out.println(code);
       } else {
          System.out.println(code);
       }
    '''