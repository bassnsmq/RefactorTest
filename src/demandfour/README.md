##　需求四　针对性修复

- hashCode 和 equals 的处理

   只要重写 equals，就必须重写 hashCode。在没有重写一方的情况下 
   在另一方给予注释提示
     
示例:
    
    class T{
        
        /* 该类重写了hashCode函数 但是没有重写equals函数 */
        @Override
        public int hashCode() {
             return super.hashCode();
        }
    }
    
    class T{
        /* 该类重写了equals函数 但是没有重写hashCode函数 */
        @Override
        public boolean equals(Object o) {
             return super.equals(o);
        }
    }
    

- 不要在 foreach 循环里进行元素的 remove/add 操作
  在使用遍历集合时 不能对循环里的元素进行增删操作
  
  出现这种情况 在更改语句的上方给予注释提示

示例: 
    
    public void test1(){
            for(String qps:list){
                run();
                // 不要在 foreach 循环里进行元素的 remove/add 操作
                list.remove(qps);
                qie(list);
            }
    }
    
    public void qie(List<String> list) {
            // 不要在 foreach 循环里进行元素的 remove/add 操作
            list.remove(10);
            pqe(list);
    }
    
    public void pqe(List<String> list) {
            // 不要在 foreach 循环里进行元素的 remove/add 操作
            list.add(100);
    }
    
-  字符串常量的比较应该使用equals 并且使用字符串常量来调用equals 这样可以避免变量值为null 而抛出异常 终止程序
    
    示例:
        
        String test = "test";
        if(test == "test"){
        }
        更改为:
        if("test".equals(test)){
        }
        
