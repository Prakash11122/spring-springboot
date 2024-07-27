package in.saiprakash.service.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.saiprakash.service.AlertSystem;
import lombok.Data;
@Profile("email")
@ConfigurationProperties(prefix = "my.app")
@Component
@Data
public class EmainAlertSystem implements AlertSystem {
	
	private String service;
	
	private String fmt;

	@Override
	public void sendMessage() {
		System.out.println("FROM EMAIL system"+ service + "-" +fmt);

	}

}
