package com.example.resumecreate.utils;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:55 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
public class TemplateUtils {
    private static Configuration configuration;

    public TemplateUtils() {
    }

    public static void setConfiguration(Configuration configuration){
        TemplateUtils.configuration=configuration;
    }

    public static Template getTemplate(String templateName){
        try {
            if (!templateName.endsWith(".ftl")){
                templateName=templateName+".ftl";
            }
            return configuration.getTemplate(templateName);
        }catch (IOException e){
            throw new RuntimeException("Template not found");
        }
    }
}
