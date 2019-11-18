package java_jichu_20191118;
//实现30到100的随机数
public class Random_number {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            int i = (int) (30 + Math.random() * 71);
            System.out.println(i);
            Thread.sleep(2000);
        }
    }
}
