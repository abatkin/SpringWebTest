package net.batkin.spring.webTest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SampleJerseyApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SampleJerseyApplication.class);
	}

	public static void main(String[] args) {
		new SampleJerseyApplication().configure(new SpringApplicationBuilder(SampleJerseyApplication.class)).run(args);
	}
}
