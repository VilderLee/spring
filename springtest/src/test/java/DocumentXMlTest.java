import com.spring.io.PathResource;
import com.spring.io.Resource;
import com.spring.io.ResourceLoader;
import com.spring.parseXML.XmlBeanDefinitionReader;
import org.junit.Test;

import java.io.IOException;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public class DocumentXMlTest {


    @Test public void test() throws IOException {
        ResourceLoader resourceLoader = new ResourceLoader();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(resourceLoader);
        try {
            xmlBeanDefinitionReader.loadBeanDefinitions("applicationContext.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
