package kr.co.indisystem.framework.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class WebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container){
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.setConfigLocation("/WEB-INF/spring/dispatcher-config.xml");


    }
}
