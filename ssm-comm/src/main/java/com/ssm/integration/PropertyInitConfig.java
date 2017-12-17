package com.ssm.integration;


import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

/**
 * 初始化系统配置
 * @author 莫小阳
 */
public class PropertyInitConfig {

    /**
     * web项目初始化配置
     */
    public static void webInitProperties() {
        Properties pps = new Properties();
        try {
            URL resource = PropertyInitConfig.class.getClassLoader().getResource("/");
            if (resource == null) {
                System.exit(0);
            }
            File file = new File(resource.getPath().concat("META-INF/config.properties"));
            try (InputStream in = Files.newInputStream(Paths.get(file.toURI()))) {
                pps.load(in);
                for (Map.Entry<Object, Object> item : pps.entrySet()) {
                    if (!"${idc}".equals(String.valueOf(item.getValue()))) {
                        System.setProperty(String.valueOf(item.getKey()), String.valueOf(item.getValue()));
                    }
                }
            }
        } catch (Exception e) {
        }
    }

}
