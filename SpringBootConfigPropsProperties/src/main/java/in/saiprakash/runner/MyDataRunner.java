package in.saiprakash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.saiprakash.model.DbConn;

@Component
@ConfigurationProperties("my.app")
public class MyDataRunner implements CommandLineRunner {
	
	private DbConn con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

	public DbConn getCon() {
		return con;
	}

	public void setCon(DbConn con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "MyDataRunner [con=" + con + "]";
	}
	
	

}
