package com.loong;

import org.apache.log4j.Logger;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class XMLTest {
    private static Logger logger = Logger.getLogger(XMLTest.class);

    /**
     * 使用dom4j读取xml
     */
    @Test
    public void testXML(){
        try {
            File xml = ResourceUtils.getFile("classpath:xml/2015元数据.xml");
            logger.info(xml.getPath());
            //创建解析器
            SAXReader reader = new SAXReader();
            Document document = reader.read(xml);
            Element root = document.getRootElement();

            //root属性列表
            List<Attribute> rootList = root.attributes();
            for(Attribute attr:rootList){
                //root属性
                logger.info(attr.getName() +" "+attr.getValue());
            }

            //root子元素列表
            List<Element> childElements = root.elements();
            for (Element child : childElements) {

                //child值
                logger.info(child.getName()+"=="+child.getText());

                //child属性列表
                List<Attribute> attributeList = child.attributes();
                for (Attribute attr : attributeList) {
                    //child属性
                    logger.info(attr.getName() + ": " + attr.getValue());
                }
                //child子元素列表
                List<Element> elementList = child.elements();
                for (Element child2 : elementList) {
                    logger.info(child2.getName() + "|| " + child2.getText());
                }
            }



        } catch (FileNotFoundException e) {
            logger.error("获取资源文件失败....."+e.getMessage());
            e.printStackTrace();
        } catch (DocumentException e) {
            logger.error("读取xml文件失败....."+e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 使用dom4j保存一个xml文件
     */
    @Test
    public void saveXML(){
        try {
            Document doc = DocumentHelper.createDocument();
            //增加根节点
            Element books = doc.addElement("books");
            //增加子元素
            Element book1 = books.addElement("book");
            Element title1 = book1.addElement("title");
            Element author1 = book1.addElement("author");
            Element book2 = books.addElement("book");
            Element title2 = book2.addElement("title");
            Element author2 = book2.addElement("author");
            //为子节点添加属性
            book1.addAttribute("id", "001");
            //为元素添加内容
            title1.setText("Harry Potter");
            author1.setText("J K. Rowling");
            book2.addAttribute("id", "002");
            title2.setText("Learning XML");
            author2.setText("Erik T. Ray");
            //实例化输出格式对象
            OutputFormat format = OutputFormat.createPrettyPrint();
            //设置输出编码
            format.setEncoding("UTF-8");
            //创建需要写入的File对象
            File file = new File("D:" + File.separator + "books1.xml");
            //生成XMLWriter对象，构造函数中的参数为需要输出的文件流和格式
            XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
            //开始写入，write方法中包含上面创建的Document对象
            writer.write(doc);
        } catch (IOException e) {
            logger.error("操作xml文件失败....."+e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 迭代XML
     */
    @Test
    public void IteratorXML() {
        try {
            SAXReader saxReader = new SAXReader();
            File xml = ResourceUtils.getFile("classpath:xml/2015元数据.xml");
            Document document = saxReader.read(xml);

            // 获取根元素
            Element root = document.getRootElement();
            logger.info("Root: " + root.getName());

            // 获取所有子元素
            List<Element> childList = root.elements();
            logger.info("total child count: " + childList.size());

            // 获取特定名称的子元素
            List<Element> childList2 = root.elements("hello");
            logger.info("hello child: " + childList2.size());

            // 获取名字为指定名称的第一个子元素
           // Element firstWorldElement = root.element("world");
            // 输出其属性
//            logger.info("first World Attr: "
//                    + firstWorldElement.attribute(0).getName() + "="
//                    + firstWorldElement.attributeValue("name"));

            logger.info("迭代输出-----------------------");
            // 迭代输出
            for (Iterator iter = root.elementIterator(); iter.hasNext();)
            {
                Element e = (Element) iter.next();
                logger.info(e.attributeValue("name"));

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
