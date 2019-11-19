package java_mianxiangduixiang_test_20191119.first_subject.java_shuzu;
//实现冒泡排序
public class bubble_sort1 {
    public static void main(String[] args) {
        int[] a1 ={23,43,24,32,15,62,78,54};
        for (int i =0;i<a1.length;i++){
            for (int j=0;j<a1.length-i-1;j++){
                if (a1[j]<a1[j+1]){
                    int temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                }
            }
        }
        for (int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}
