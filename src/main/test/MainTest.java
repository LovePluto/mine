
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.wyh.tw.Badminton.checkInput;


public class MainTest {


    @Test
    public void test() {

        String s = "U002 2017-08-01 19:00~22:00 A";
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());
        Badminton.Node node = new Badminton.Node(s);
        Badminton.Node node1 = new Badminton.Node(s);

        System.out.println(node);
        Assert.assertEquals(node, node1);
        if (node.equals(node1)) {
            System.out.println("true");
        }
    }

    @Test
    public void test1() {
        LocalTime localTime = LocalTime.parse("22:00");
        LocalTime localTime1 = LocalTime.parse("22:00");
        if (localTime1.isBefore(localTime)) {
            System.out.println("true");
        }
        if (localTime1.equals(localTime)) {
            System.out.println("true2");
        }
//        Assert.assertFalse(localTime.isBefore(localTime1)); //false
        System.out.println(localTime);
    }

    @Test
    public void test2() {
//        checkInput("U002 2017-08-01 19:00~22:00 A");
        String s = "U002 2017-08-01 19:00~22:00 A";
        String s1 = "U002 2017-08-01 19:00~20:00 A";
        Badminton.Node node = new Badminton.Node(s);
        Badminton.Node node1 = new Badminton.Node(s1);
        if (node.checkTimeOver(node1)){
            System.out.println("true");
        }
    }
}
