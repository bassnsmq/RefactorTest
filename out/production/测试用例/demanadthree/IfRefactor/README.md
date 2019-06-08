# if重构
### if重构

### 重构规则

表达异常的分支时，少用 if-else 方式，这种方式可以改写成：
    
    if (condition) {
    ... return obj; 
    } 
即使使用 if-else 语句 也不要超过三个

- 方式一: 卫语句重构

### 卫语句重构
示例:1

    '''
    double getPayAmount(){
        double result;
        if(_isDead){
            result = deadAmout();
        }else{
            if(_isSeparated){
                result = separatedAmount();
            }else{
                if(_isRetired){
                    result = retiredAmount();
                } else{
                    result = normalPayAmount();
                }
            }
        }
    }
    return result; 
    '''
示例2:

    '''
    double getAdjustedCaptital(){
        double result = 0.0;
        if(_capital>0.0){
            if(_initRate>0.0&&_duration>0.0){
                result = (_income/_duration) * ADJ_FACTOR;
            }
        }
        return result;
    }
    '''

重构后:
示例1:

    '''
    double getPayAmount(){
        if(_isDead){
            return deadAmount();
        }
        if(_isSeparated){
            return separatedAmount();
        }
        if(_isRetired){
            return retiredAmount();
        }
        return normalPayAmount();
    }
    '''

示例2:
    
    '''
    double getAdjustedCapital(){
        double result = 0.0;
        if(_capital<=0.0){
            return result;
        }
        if(_intRate<=0.0||_duration<=0.0){
            return result;
        }
        return (_income/_duration)*ADJ_FACTOR;
    }
    '''    
    
