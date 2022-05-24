import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Categories.class)
@Categories.IncludeCategory(BMI_BP_IF2.class)
@Suite.SuiteClasses({BloodPressuretest.class, BMItext.class})
public class BMI_BP_Category {

}
