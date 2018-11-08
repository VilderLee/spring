import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */

public class Main {

    @Test
    public void test(){
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        Resource resource = new ClassPathResource("applicationContext.xml");
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        com.spring.bean.Test test = (com.spring.bean.Test) defaultListableBeanFactory.getBean("test");
        test.sat();
    }
}
