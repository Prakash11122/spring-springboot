package in.saiprakash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.saiprakash.service.AlertSystem;

@Component
public class TestprofileAnno implements CommandLineRunner{
	
	
	@Autowired
	private AlertSystem als;

	@Override
	public void run(String... args) throws Exception {
		als.sendMessage();
		
	}

}
