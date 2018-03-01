package com.loong.util;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

public class ResourceFileTest {

    private static Logger logger = Logger.getLogger(ResourceFileTest.class);
    @Test
    public void testGetResourceFile(){
        try {
            File xml = ResourceUtils.getFile("classpath:xml/2015元数据.xml");
            logger.info(xml.getPath());
        } catch (FileNotFoundException e) {
            logger.error("获取资源文件失败....."+e.getMessage());
            e.printStackTrace();
        }


    }
}
