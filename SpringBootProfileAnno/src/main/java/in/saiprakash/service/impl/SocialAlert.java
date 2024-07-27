package in.saiprakash.service.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.saiprakash.service.AlertSystem;
import lombok.Data;

@Profile("social")
@ConfigurationProperties(prefix = "my.app")
@Component
@Data
public class SocialAlert implements AlertSystem {
	
	private String service;

	private String fmt;
	
	@Override
	public void sendMessage() {
		
		System.out.println("Social message " + service + "-" + fmt);

	}

}
