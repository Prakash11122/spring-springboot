package in.saiprakash.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	@Scheduled(fixedDelay = 4000) //1000 mill sec = 1sec
	public void printMsg() {
		System.out.println("Hi Hero" + new Date());
	}

}
