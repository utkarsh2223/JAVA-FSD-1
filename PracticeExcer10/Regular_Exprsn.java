package PracticeExcer10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Exprsn {

	public static void main(String[] args) {

		String pattern = "cat";
		String testString = "The cat in the hat";
		Pattern regex = Pattern.compile(pattern);
		Matcher matcher = regex.matcher(testString);
		
		System.out.println("Matches found in the test string:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        
        String replacedString = matcher.replaceAll("dog");
        System.out.println("The replaced string is: " + replacedString);
        

	}

}

