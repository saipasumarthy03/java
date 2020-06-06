package org.session9.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static final String EXAMPLE="String used for pattern matching";
	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("\\w+");
		Matcher matcher=pattern.matcher(EXAMPLE);
		while(matcher.find())
		{
			System.out.println("sart index is :"+matcher.start());
			System.out.println("end index is : "+matcher.end());
			System.out.println(matcher.group());
		}
	}

}
