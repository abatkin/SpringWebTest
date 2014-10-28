package net.batkin.spring.webTest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/services")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(Endpoint.class);
	}
}
