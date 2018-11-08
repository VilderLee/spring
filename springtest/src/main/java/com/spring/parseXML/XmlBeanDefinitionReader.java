package com.spring.parseXML;

import com.spring.factory.BeanDefinition;
import com.spring.io.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

/**
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2018/11/8      Create this file
 * </pre>
 */
public class XmlBeanDefinitionReader extends AbstractBeanDefinitionReader {

    public XmlBeanDefinitionReader(ResourceLoader resourceLoader) {
        super(resourceLoader);
    }

    public void loadBeanDefinitions(String location) throws Exception {
        InputStream inputStream = getResourceLoader().getResourceLoader(location).getInputStream();
        documentParse(inputStream);
    }

    /**
     *
     *  @param inputStream
     *  dom解析xml:
     *
     *     优点:
     *         1.形成了树结构
     *         2.解析过程中，树结构保存在内存中
     *
     *     缺点:
     * 　　　　　1.由于文件是一次性读取，所以对内存的耗费比较大。
     * 　　　　　2.如果XML文件比较大，容易影响解析性能且可能会造成内存溢出。
     *
     */
    private void documentParse(InputStream inputStream) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            Document document = dbf.newDocumentBuilder().parse(inputStream);

            //获取节点beans
            Element element = document.getDocumentElement();
            elementParse(element);

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void elementParse(Element element) {

        //拿到beans下面所有的子节点
        NodeList nodeList = element.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            //拿到具体的bean
            Node node = nodeList.item(i);
            if(node instanceof Element){
                Element ele = (Element) node;
                parseBean(ele);

            }

        }
    }

    private void parseBean(Element ele) {
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanName(ele.getAttribute("id"));
        beanDefinition.setBeanClass(ele.getAttribute("id"));
    }

    /**
     *
     *
     * @param inputStream
     *
     * SAX解析xml:
     *
     *     优点:
     *         1.采用事件驱动模式，对内存耗费比较小。
     *         2.适用于只处理XML文件中的数据时。
     *
     *     缺点:
     * 　　　　　1.编码比较麻烦。
     * 　　　　　2.很难同时访问XML文件中的多处不同数据。
     *
     */
    private void saxParse(InputStream inputStream){
        SAXParserFactory factory = SAXParserFactory.newInstance();
    }
}
