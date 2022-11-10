package com.example.resumecreate.configs;

import com.example.resumecreate.utils.TemplateUtils;
import freemarker.template.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author "Tojaliyev Asliddin"
 * @since 11/11/22 00:38 (Friday)
 * ResumeCreate/IntelliJ IDEA
 */
@Component
@RequiredArgsConstructor
public class StaticContextInitializer {
    private final Configuration configuration;

    @PostConstruct
    public void init(){
        TemplateUtils.setConfiguration(configuration);
    }
}
