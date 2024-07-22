package in.saiprakash;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pod")
public class Product {
	
	@Value("5")
	private int Pid;
	
	@Value("PEN")
	private String pCode;
	
	public void display() {
		System.out.println( Pid + " - " + pCode);
	}

}
