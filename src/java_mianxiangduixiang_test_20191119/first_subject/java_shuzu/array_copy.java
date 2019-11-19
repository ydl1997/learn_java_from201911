package java_mianxiangduixiang_test_20191119.first_subject.java_shuzu;
//使用system的静态方法arraycopy实现数组的复制
public class array_copy {
    public static void main(String[] args) {
        int [] a1 ={1,2,2,3,4,5};
        for (int i = 0;i<a1.length;i++){
        System.out.println("这是源数组"+a1[i]);}
        int [] a2 =new int[7];
        System.arraycopy(a1,0,a2,0,a1.length);
        for (int y=0;y<a2.length-1;y++){
            System.out.println(a2[y]);
        }
    }
}
