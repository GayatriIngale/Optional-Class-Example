package OptionalClasses;

import java.util.Optional;

public class OptionalClassExample {
	
public static void main(String[] args) throws Exception {
		
		//ofnullable example
		
		String str=null;
		Optional<String> optionalStr=Optional.ofNullable(str);
		
		if(optionalStr.isPresent())
			System.out.println(str.length());
		else
			System.out.println("null values");
		
		// ofnullable example

		String str1 = "Java8";
		Optional<String> optionalStr1 = Optional.ofNullable(str1);

		if (optionalStr1.isPresent())
			System.out.println(str1.length());
		else
			System.out.println("null values");
		
		// ofnullable example with orElse

		String str2 = null;
		String optionalStr2 = Optional.ofNullable(str2).orElse("default");
		System.out.println(optionalStr2);
//		
		//ofnullable with orElseThrow
		String str3= null;
		String optionalStr3 = Optional.ofNullable(str3).orElseThrow(() -> new Exception());
		System.out.println(optionalStr3);
		
		
		
//		String string=null;
//		if(string!=null)
//			System.out.println(string.length());
//		else
//			System.out.println("string is null");
		
	}



}
