package com.loong.util;

import org.apache.log4j.Logger;
import org.junit.Test;


public class ConstantUtilsTest {
    private static Logger logger = Logger.getLogger(ConstantUtilsTest.class);

    /**
     * 读取资源文件
     */
    @Test
    public void testSolrUrl(){
        logger.info(ConstantUtils.SOLR_URL);
    }
}
