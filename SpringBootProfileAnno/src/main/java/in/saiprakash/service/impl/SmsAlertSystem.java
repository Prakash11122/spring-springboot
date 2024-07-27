package in.saiprakash.service.impl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.saiprakash.service.AlertSystem;
import lombok.Data;

@Profile("default")
@ConfigurationProperties(prefix = "my.app")
@Component
@Data
public class SmsAlertSystem implements AlertSystem {
	
	private String service;
	
	private String fmt;

	@Override
	public void sendMessage() {
		System.out.println("FROM SMS SYSTEM- "+ service + "-"+ fmt);

	}

}
