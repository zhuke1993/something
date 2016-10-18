package com.zhuke.something.spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by ZHUKE on 2016/9/14.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("classpath:application.xml");
        System.out.println(resource.getFile().getAbsolutePath());
    }
}
