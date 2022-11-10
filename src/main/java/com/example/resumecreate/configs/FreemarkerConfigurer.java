package com.example.resumecreate.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

/**
 * @author "Tojaliyev Asliddin"
 * @since 10/11/22 23:31 (Thursday)
 * ResumeCreate/IntelliJ IDEA
 */
@Configuration
public class FreemarkerConfigurer {

    @Bean
    public FreeMarkerConfigurationFactoryBean configuration(){
        FreeMarkerConfigurationFactoryBean bean=new FreeMarkerConfigurationFactoryBean();
        bean.setTemplateLoaderPath("classpath:/templates/");
        return bean;
    }
}
