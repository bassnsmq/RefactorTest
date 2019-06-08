#　for转换为while
### 重构规则
    对于for(;;) for(int i;;) 或者 for(;i<10;) for(;;i++)这种 残缺的for语句
    将其转换为一个while
### 转换规则 
示例:

查找的for语句
    
    for(;i<100;){
        xxx
    }    
    
    for(int i=0;;){
        xxx
    }
    
    for(;;){
        xxx
    }
    
    for(;;i++){
        xxx
    }

重构后语句:
    
    while(i<100){
        xxx
    }
    
    int i=0;
    while(true){
        xxx
    }
    
    while(true){
    
    }
    
    while(true){
        i++;
    }
    