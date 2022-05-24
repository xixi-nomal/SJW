import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.locks.Condition;

import static org.junit.Assert.assertTrue;

/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 04 22 10:43
 **/
@RunWith(Parameterized.class)
public class PARAMIS {
    double curW;
    double curH;
    String curExcepted;

    public PARAMIS(double s,double h,String expected)
    {
        curW=s;
        curH=h;
        curExcepted=expected;
    }


    @Test
    public void Test(){
        BMI bmi=new BMI(this.curW, this.curH);
        String expect = this.curExcepted;
        String result = bmi. getBMIType();
        assertTrue(result ==expect);
        String consele=" 身高:"+this.curH+",体重:"+this.curW+",预测数据:"+this.curExcepted+",诊断结果"+result;
        System . out . println(consele);
    }

    @Parameterized.Parameters
    public static Collection testDataSet()
    {
        System.out.println("print Collection testDataSet()");
        return Arrays.asList(new Object[][]{
                {45.0, 1.6, "偏瘦"},
                {55.0, 1.6, "正常"},
                {68.0, 1.6, "偏胖"},
                {80.0, 1.6, "肥胖"}
        });
    }



}
