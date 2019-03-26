package com.incontext.vr.utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class Config {

    static private Properties pro;


    static {
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            pro = new Properties();
            pro.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println(path + " Not Found");
        }

    }

    public static String getProperty(String key){
        return pro.getProperty(key);
    }


}
