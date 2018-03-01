package com.loong.util;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConstantUtils {

    static {
        try {
            Configuration configuration = new PropertiesConfiguration("resource.properties");
            SOLR_URL = configuration.getString("solr_url");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
    /**
     * solr连接路径
     */
    public static String SOLR_URL;

}
