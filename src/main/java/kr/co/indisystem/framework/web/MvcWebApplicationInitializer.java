package kr.co.indisystem.framework.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { MvcWebApplicationCofigurartion.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
