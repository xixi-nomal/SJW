import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;
/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 04 25 08:16
 **/
@RunWith(Parameterized.class)
public class BloodPressuretest {
    int p1;
    int p2;
    String curStr;

    public BloodPressuretest(int p1, int p2, String curStr) {
        this.p1 = p1;
        this.p2 = p2;
        this.curStr = curStr;

    }

    @org.junit.Test
    public void test() {
        BloodPressure BP = new BloodPressure(this.p1, this.p2);
        String res = BP.getPressureLevel();
        assertTrue(res == this.curStr);
        BP = null;
    }

    @Parameterized.Parameters
    public static Collection testDataSet() {
        System.out.println("print Collection testDataSet()");
        return Arrays.asList(new Object[][]{
                {100, 70, "正常"},
                {130, 85, "正常高值"},
                {150, 95, "1级高血压"},
                {170, 105, "2级高血压"},
                {190, 120, "3级高血压"}
        });
    }
}
