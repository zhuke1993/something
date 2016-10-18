import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ZHUKE on 2016/9/14.
 */

public class ResourceTest extends SpringTestBase {
    @Test
    public void testClasspathResource() throws IOException {
        Resource resource = new ClassPathResource("applicationContext.xml");
        System.out.println(resource.getFile().getPath());
    }
}
