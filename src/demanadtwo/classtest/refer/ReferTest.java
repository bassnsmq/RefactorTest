package demanadtwo.classtest.refer;
//类名引用中的import依赖重构
import demanadtwo.classtest.model.testModel;

import java.util.*;

//类名引用中的extend依赖重构
public class ReferTest extends testModel {
    //类名引用中的成员普通变量依赖重构
    public testModel model=new testModel();
    //类名引用中的成员List变量依赖重构
    public List<testModel> modelArrayList=new ArrayList<testModel>();
    //类名引用中的成员Map变量依赖重构
    public Map<String, testModel> modelMap=new HashMap<String, testModel>();
    //类名引用中的成员Set变量依赖重构
    public Set<testModel> modelSet=new HashSet<testModel>();
    //类名引用中的参数依赖重构
    public void test(testModel model){
        List<testModel> modelArrayList1=new ArrayList<testModel>();
        Map<String, testModel> modelMap1=new HashMap<String, testModel>();
         Set<testModel> modelSet1=new HashSet<testModel>();
         testModel test=new testModel();
    }
}
