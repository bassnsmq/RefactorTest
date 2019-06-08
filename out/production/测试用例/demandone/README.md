## 需求一 代码格式重构

- 打印格式

    使用eclipse jdt 采用谷歌java代码规范 也可自定义 配置按照eclipse配置即可

- 格式修复
    大括号与if, else, for, do, while语句一起使用，即使只有一条语句(或是空)，
    也应该把大括号写上,自动补充
    
    
- 对于覆写的方法必须加@Override注释
    
    对于覆写方法但没有@Override注释 的自动添加注释

- 对于部分变量声明或赋值执行更正
    
    Array args[];
    更正为
    Array[] args;
    
    Long arg = 2l;
    更正为
    Long arg = 2L;
    
- 清除未使用的导入
    
    将为使用额导入从文件中清除
    
