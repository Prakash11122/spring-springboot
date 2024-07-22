package com.SaiPrakash.in;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eob")
public class EmpService {
	
	@Value("bbsr")
	private String code;

	@Override
	public String toString() {
		return "EmpService [code=" + code + "]";
	}
	

}
