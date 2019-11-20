package java_changyonglei;
//实现10到200的随机数
public class math1 {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            int a = 10 + (int) (Math.random() * 191);
            Thread.sleep(1000);
            System.out.println(a);
        }
    }
}
