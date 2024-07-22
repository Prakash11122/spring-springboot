package in.saiprakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aob")
public class Address {
	
	@Value("5-A")
	private String hno;
	@Value("HYD")
	private String loc;
	
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", lol=" + loc + "]";
	}
	
	
	
	
	

}
