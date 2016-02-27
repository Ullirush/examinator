package com.examinator.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by tr0tt3l on 27.02.16.
 */
// ServletInitializer ersetzt das Standard web.xml
// Tomcat ruft SpringServletContainerInitializer auf, dass nach Klassen mit dem Namen IrgendwasServletInitializer sucht,
// und landet dann hier
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }
    // hier definieren wir das Servlet Root, aktuell wirklich root
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
