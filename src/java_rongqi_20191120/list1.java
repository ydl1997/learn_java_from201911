package java_rongqi_20191120;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//容器list
public class list1 {
    public static void main(String[] args) {
        //array list
        List<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        //第一种遍历方式-foreach
        for (int i:arrayList){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------------------");
        //第二种遍历方式-for
        for (int index=0;index<arrayList.size();index++){
            int a =arrayList.get(index);
            System.out.println(a);
        }
        System.out.println("------------------------------------------------------------------------");
        //第三种遍历方式-迭代器
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            int a =iterator.next();
            System.out.println(a);
        }
        System.out.println("---------------------------------------------------------------------------");
        //Linked list
        List<String> linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        for (String c:linkedList){
            System.out.println(c);
        }
    }
}
