package in.saiprakash;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class RunnerProfileData implements CommandLineRunner {
	
	private String title;
	
	private String version;
	
	private String host;
	
	private String port;
	
	private String driver;
	
	private String url  ;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
