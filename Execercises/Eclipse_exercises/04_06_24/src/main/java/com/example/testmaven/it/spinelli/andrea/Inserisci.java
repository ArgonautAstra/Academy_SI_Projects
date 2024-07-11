package com.example.testmaven.it.spinelli.andrea;

public class Inserisci {

	private String s;
	private char c;
	
	public Inserisci() {}
	
	public Inserisci(String s, char c) {
		this.s = s;
		this.c = c;
	}
	
	public String insertChar(String s, char c) {
		
		char[] sArray = s.toCharArray();
		String tmp = new String();
		
		for(int i = 0; i < sArray.length; i++) {
			tmp += sArray[i];
			if(i != sArray.length - 1)
				tmp += c;
		}
		
		return tmp;
		
		//char[] res = new char[sArray.length * 2];
		
		/*
		for(int i = 0; i < sArray.length; i++) {
			res[2*i] = sArray[i];
				if(i<sArray.length-1)
					res[2*i+1] = c;
		}
		*/
		
	}
	
	public String insertCharRecursive(String s, char c, boolean flag) {
		
		
		if(s.length() > 1) {
			System.out.print(s.charAt(0)+""+c);
			
			return insertCharRecursive(s.substring(1), c, flag);		
		}else {
			if(flag) {
				flag = false;
				return s;
			}else
				return s + "" + c;
		}
	}
}
