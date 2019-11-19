package java_changyonglei;
//获取当前日期
import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();//抽象类不能直接new
        System.out.println(calendar.get(Calendar.YEAR)+"年"+calendar.get(Calendar.MONTH)+"月"+calendar.get(Calendar.DATE)+"日");
    }
}
