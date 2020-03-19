package com.epam.tasks.tddJunitTask1;

public class Remove_A_s_inFirst2Chars {

	public String removeFirstA_s(String str) {
		String result=str;
		if(str.length()==1 && str.charAt(0)=='A')
			result="";
		else if(str.length()==1)
			result=str;
		else if(str.charAt(0)=='A' && str.charAt(1)=='A')
			result=str.substring(2);
		else if(str.charAt(0)=='A')
			result=str.substring(1);
		else if(str.charAt(1)=='A')
			result=str.charAt(0)+str.substring(2);
		return result;
	}
	

}
