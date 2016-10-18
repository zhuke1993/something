import com.zhuke.something.aop.Interface;
import com.zhuke.something.transaction.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created by ZHUKE on 2016/9/8.
 */
public class AOPTest extends SpringTestBase {
    @Autowired
    private Interface realObject;

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testAOP() {
        System.out.println(realObject.getClass());
        System.out.println(userInfoService.getClass());
    }
}
