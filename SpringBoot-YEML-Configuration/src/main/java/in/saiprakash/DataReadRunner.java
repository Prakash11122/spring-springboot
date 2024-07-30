package in.saiprakash;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "my.app")
@Data
@Component
public class DataReadRunner  implements CommandLineRunner{
	
	private String driver;
	
	private String url;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
