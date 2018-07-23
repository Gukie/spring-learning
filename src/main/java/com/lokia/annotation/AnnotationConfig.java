package com.lokia.annotation;

import com.lokia.annotation.custom.CustomBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author gushu
 * @data 2018/7/23
 */
@Configuration
@ComponentScan(value = "com.lokia.annotation", excludeFilters = {@ComponentScan.Filter(Service.class)},nameGenerator = CustomBeanNameGenerator.class)
public class AnnotationConfig {
}
