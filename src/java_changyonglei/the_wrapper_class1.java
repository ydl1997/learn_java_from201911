package java_changyonglei;
//以int的包装类为例解释自动拆装箱
public class the_wrapper_class1 {
    public static void main(String[] args) {
        int a =new Integer(100);
        int b =Integer.valueOf(100);
        if (a==b){//比较的是内存地址
            System.out.println("a和b是相同的");
        }
    }
}
