package com.djk.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class App  extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(App.class, args);
    }
    

	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setPort(8090);  
	}  
}
