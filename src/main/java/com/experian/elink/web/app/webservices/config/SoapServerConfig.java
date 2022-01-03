package com.experian.elink.web.app.webservices.config;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import java.util.List;

@EnableWs
@Configuration
@Slf4j
public class SoapServerConfig extends WsConfigurerAdapter {

    @SneakyThrows
    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
        validatingInterceptor.setValidateRequest(true);
        validatingInterceptor.setValidateResponse(true);
        validatingInterceptor.setXsdSchema(elinkSchema());
        interceptors.add(validatingInterceptor);
    }

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        log.info("Configuring ServletRegistrationBean");
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/elinkInsertRequest");
    }

    @Bean(name = "elink")
    public SimpleWsdl11Definition SimpleWsdl11DefinitionForElink() {
        log.info("Configuring SimpleWsdl11Definition");
        SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
        wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/elink.wsdl"));
        return wsdl11Definition;
    }

    @Bean(name = "linkSchema")
    public XsdSchema elinkSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/elink.xsd"));
    }


}
