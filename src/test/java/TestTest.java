//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class TestTest {
//    BMI bmiObj;
//    @Before
//    public void BeforeTest()  {
//
//        bmiObj = new BMI();
//        System.out.println("Run @Before method");
//
//    }
//
//    @After
//    public void AfterTest()  {
//
//        bmiObj = null;
//        System.out.println("Run @After method");
//    }
//
//
//    @BeforeClass
//    public static void BeforeTestClass()
//    {
//        System.out.println("Run @BeforeClass method");
//    }
//
//
//    @AfterClass
//    public static void AfterTestClass()
//    {
//        System.out.println("Run @AfterClass method");
//    }
//
//
//    @Test
//    public void testGetBMIType_Thine() {
//        //创建被测类对象
//
//
//        //bmiObj = new BMI(45.0, 1.6);
//        bmiObj.setParams(45.0, 1.6);
//        String expect = "偏瘦";
//
//        //调用被测方法
//        String result = bmiObj.getBMIType();
//
//        //利用断言执行校验
//        assertTrue( result== expect);
//        bmiObj = null;
//        //fail("Not yet implemented");
//    }
//
//    @Test
//    public void testGetBMIType_Normal(){
//        //创建被测类对象
//
//
//        //bmiObj = new BMI(55.0, 1.6);
//        bmiObj.setParams(55.0, 1.6);
//        String expect = "正常";
//
//        //调用被测方法
//        String result = bmiObj.getBMIType();
//
//        //利用断言执行校验
//        assertTrue( result== expect);
//        bmiObj = null;
//    }
//
//    @Test
//    public void testGetBMIType_SlightFat(){
//        //创建被测类对象
//
//
//        //bmiObj = new BMI(68.0, 1.6);
//        bmiObj.setParams(68.0, 1.6);
//        String expect = "偏胖";
//
//        //调用被测方法
//        String result = bmiObj.getBMIType();
//
//        //利用断言执行校验
//        assertTrue( result== expect);
//        bmiObj = null;
//    }
//
//
//    @Test
//    public void testGetBMIType_Fat(){
//        //创建被测类对象
//
//
//        //bmiObj = new BMI(80.0, 1.6);
//        bmiObj.setParams(80.0, 1.6);
//        String expect = "肥胖";
//
//        //调用被测方法
//        String result = bmiObj.getBMIType();
//
//        //利用断言执行校验
//        assertTrue( result== expect);
//        bmiObj = null;
//
//    }
//
//
//}