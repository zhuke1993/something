import com.zhuke.something.guava.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by ZHUKE on 2016/9/7.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringTestBase extends AbstractTestNGSpringContextTests {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testInsert() throws Exception {
        userInfoService.insert();
    }
}
