import com.zhuke.something.aop.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created by ZHUKE on 2016/9/8.
 */
public class AOPTest extends SpringTestBase {
    @Autowired
    private Interface realObject;

    @Test
    public void testAOP() {
        //realObject.doSomething();

    }
}
