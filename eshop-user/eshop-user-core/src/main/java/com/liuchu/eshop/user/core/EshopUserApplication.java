package com.liuchu.eshop.user.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author liuchu
 * Date 2020/7/9
 * Time 17:17
 */
@SpringBootApplication
public class EshopUserApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EshopUserApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EshopUserApplication.class);
    }
}
