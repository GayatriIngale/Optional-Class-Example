package OptionalClasses;

import java.util.Optional;

public class OptionalClass {
	
   public static void main(String args[]) {
	   String[] str = new String[10];
	   
	   Optional<String> check = Optional.ofNullable(str[5]);
	   if(check.isPresent()) {
		   String str2 = str[5].toLowerCase();
     	   System.out.println(str2);
	   }
	   else 
		   System.out.println("String value not present");
	   
	   
	   System.out.println("Use orElse method  "+check.orElse("Default"));
	   
	   str[4] = "JAVA8 FEATURS";
	   Optional<String> check1 = Optional.ofNullable(str[4]);
	   System.out.println(check1.orElse("Default"));
	     System.out.println(check1.get());    
       System.out.println(str[4].toLowerCase()); 
       System.out.println("Method reference");
       check1.ifPresent(System.out::println);
       
   }

}
