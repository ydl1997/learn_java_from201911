package java_rongqi_20191120;

import java.util.ArrayList;
import java.util.Iterator;

//实现Array list 添加对象 遍历对象
public class list2 {
    public static void main(String[] args) {
        List_test list_test1 = new List_test("马珂珂","女");
        List_test list_test2 = new List_test("庞志华","女");
        List_test list_test3 = new List_test("姚子杰","男");
        List_test list_test4 = new List_test("李奥","男");

        ArrayList<List_test> list_tests = new ArrayList();
        list_tests.add(list_test1);
        list_tests.add(list_test2);
        list_tests.add(list_test3);
        list_tests.add(list_test4);
        System.out.println("------------------------------------------------------------------");
        //第一种遍历方式-for
        for (int index=0;index<list_tests.size();index++){
            List_test a = list_tests.get(index);
            System.out.println("姓名："+a.getName()+"性别："+a.getSex());
        }
        System.out.println("------------------------------------------------------------------------------");
        //第二种遍历方式-foreach
        for (List_test b:list_tests){
            System.out.println("姓名："+b.getName()+"性别："+b.getSex());
        }
        System.out.println("------------------------------------------------------------------------");
        //第三种遍历方式-迭代器
        Iterator<List_test> iterator = list_tests.iterator();
        while (iterator.hasNext()){
            List_test c =iterator.next();
            System.out.println("姓名："+c.getName()+"性别："+c.getSex());
        }
    }
}
