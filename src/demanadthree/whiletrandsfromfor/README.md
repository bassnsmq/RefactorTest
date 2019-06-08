# while 转换为for
### 转换规则

循环体中的语句要考量性能 如果该变量仅在循环语句中使用 并且是循环判定条件 那么写成for语句会更好

while 转for

- initCondition 初始化条件语句在到达while 必须不能被更改或者使用
- compareCondition 比较语句
- updateCondition  更新语句必须在while之内且 在确定更新语句后 更新语句不在更改

### 转换示例
    
    '''
    int i = 0;
    int b = 0
    //i被改变
    i++;
    while(i<100&&b<100){
        run();
        i++;
        b++;
    }
    '''

### 重构后
    '''
    int i=0;
    i++;
    for(int b=0;i<100&&b<100;i++,b++){
        run();
    }
    '''