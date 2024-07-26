package in.saiprakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.app")
public class MyDataRunner implements CommandLineRunner{
	
	private int id;
	
	private String code;
	
	private Double cost;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
