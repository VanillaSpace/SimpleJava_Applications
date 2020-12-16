package MidtermQ2;

import java.util.Comparator;

public class givenNameCompare implements Comparator<Employee> {
	
public givenNameCompare() {}
	
	@Override
	public int compare(Employee o1, Employee o2) {
	    int r=o1.GetGivenName().compareTo(o2.GetGivenName());
	    if(r==0)
	    	r=o1.GetName().compareTo(o2.GetName());
	    if(r==0)
	    	r=o1.GetId()-o1.GetId();
		return r;
	}
	
}
