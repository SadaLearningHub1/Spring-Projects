import java.util.regex.*;    
import java.util.*;    
public class Sample{  
	public static void main(String args[]){  
		String result = obstuscateMailId("sadasivarao@gmail.com");
		System.out.println(result);

	} 

	static String obstuscateMailId (String mailId) {
		String regex = "^(.+)@(.+)$";    
		Pattern pattern = Pattern.compile(regex); 
		String ouputemail = null;

		Matcher matcher = pattern.matcher(mailId);  
		if(matcher.matches()) {
			String[] mailidArray = mailId.split("@");
			if(mailidArray.length != 0) {
				if(mailidArray[0].length()<5){
					mailidArray[0] = mailidArray[0].replaceAll("[a-z]", "*");
					ouputemail = mailidArray[0]+"@"+mailidArray[1];
				}else {
					ouputemail = mailId.substring(1);
					System.out.println(ouputemail);
					ouputemail = "***"+ouputemail;
				}
			}
			return ouputemail;
		}else {
			return "invalid input";
		}
		
		
	} 

}  