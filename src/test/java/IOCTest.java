import com.zhuke.something.transaction.UserInfoService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.testng.annotations.Test;

/**
 * Created by ZHUKE on 2016/9/9.
 */
public class IOCTest {

    @Test
    public void testIOCStartup() {
        ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        reader.loadBeanDefinitions(classPathResource);
        UserInfoService bean = defaultListableBeanFactory.getBean(UserInfoService.class);
        System.out.println(bean.getClass());
    }
}
