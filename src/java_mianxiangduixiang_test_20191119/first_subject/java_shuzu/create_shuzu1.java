package java_mianxiangduixiang_test_20191119.first_subject.java_shuzu;
//使用new创建数组
public class create_shuzu1 {
    public static void main(String[] args) {
        int[] a =null;
        a=new int[10];
        for (int i=0;i<10;i++){
            a[i] =(2*i+1);
            System.out.println(a[i]);
        }

    }
}
