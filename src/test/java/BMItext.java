import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

/**
 * @program: SJW
 * @description: SJW
 * @auther: shijiawen
 * @create: 2022 04 18 09:26
 **/
public class BMItext {

        BMI bmiObj = null;
        public BMItext(){
            System.out.println("Run BMITest");
        }

        @BeforeClass
        public static void setUpBeforeClass() throws Exception {
            System.out.println("Run setUpBeforeClass");
        }

        @AfterClass
        public static void tearDownAfterClass() throws Exception {
            System.out.println("Run tearDownAfterClass");
        }

        @Before
        public void setUp() throws Exception {
            bmiObj = new BMI();
            System.out.println("Run setUp");
        }

        @After
        public void tearDown() throws Exception {
            System.out.println("Run tearDown");
        }
        @Category({BMI_BP_IF2.class})
        @Test()
        public void testGetBMIType(){
            //创建被测类对象
            // BMI bmiObj = new BMI(45.0, 1.6);
            bmiObj.setParams(45.0, 1.6);
            //调用被测方法
            String strType = bmiObj.getBMIType();
            //利用断言执行校验
            assertTrue(strType == "偏瘦");
            System.out.println("RUN testGetBMIType");
        }

    @Category({BMI_BP_IF.class, BMI_BP_IF2.class})
    @Test
    public void testGetBMIType2(){
            //BMI bmiObj = new BMI(55.0, 1.6);
            bmiObj.setParams(55.0, 1.6);
            String strType = bmiObj.getBMIType();
            assertTrue(strType == "正常");
            System.out.println("RUN testGetBMIType");

        }

        @Test()
        public void testGetBMIType3(){
            // BMI bmiObj = new BMI(68.0, 1.6);
            bmiObj.setParams(68.0, 1.6);
            String strType = bmiObj.getBMIType();
            assertTrue(strType == "偏胖");
            System.out.println("RUN testGetBMIType");

        }

        @Test()
        public void testGetBMIType4(){
            // BMI bmiObj = new BMI(88.0, 1.6);
            bmiObj.setParams(88.0, 1.6);
            String strType = bmiObj.getBMIType();
            assertTrue(strType == "肥胖");
            System.out.println("RUN testGetBMIType");

        }

        @Test
        public void TestWeight(){
            System.out.println("Test Weight");
        }
    }


