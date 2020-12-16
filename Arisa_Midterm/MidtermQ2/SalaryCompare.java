package MidtermQ2;
import java.util.Comparator;

public class SalaryCompare implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		int r=(int)(o1.GetSalary()-o2.GetSalary());
		if(r==0)
			r=o1.GetId()-o2.GetId();
		return r;
	}

}
