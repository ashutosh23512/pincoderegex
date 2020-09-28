package com.pincoderegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPro {

	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile("^[0-9]{3}\\s{0,1}[0-9]{3}$");		
		Matcher matcher=pattern.matcher("400 088");
		boolean matchFound=matcher.find();
		if(matchFound)
		{
			System.out.println("Matched");
		}
		else
		System.out.println("Not Matched");

	}

}

//^[0-9 ]*$