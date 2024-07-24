package in.saiprakash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.saiprakash.EmpExport;

@Configuration
public class AppConfig {
	
	@Bean
	public EmpExport eob() {
		EmpExport ee = new EmpExport();  
		ee.setCode(555);
		ee.setName("SaiPrakash");
		return ee;
	}

}
