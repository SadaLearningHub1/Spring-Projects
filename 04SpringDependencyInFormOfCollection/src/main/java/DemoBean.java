import java.util.Map;
import java.util.Set;

public class DemoBean {
	
	private Set theSet;
	private Map theMap;
	
	//Setter injection
	public void setTheSet(Set theSet) {
		this.theSet = theSet;
	}
	public void setTheMap(Map theMap) {
		this.theMap = theMap;
	}
	public void showTheSet() {
		System.out.println(theSet);
	}
	public void showTheMap() {
		System.out.println(theMap);
	}
	
	

}
