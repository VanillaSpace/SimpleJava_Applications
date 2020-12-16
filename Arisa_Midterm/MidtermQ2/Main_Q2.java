package MidtermQ2;
import java.util.Set;
import java.util.TreeSet;

public class Main_Q2 {

	public static void main(String[] args) throws employeeDataException {
		// TODO Auto-generated method stub

		
		  Employee Bugs=new Employee(101,"Bugs","Bunny",800);
		  Employee Donald=new Employee (220,"Donald","Duck",1050);
		  Employee Mickey=new Employee(153,"Mickey","Mouse",1600);
		  Employee Max=new Employee(180,"Max","Goof",1230);
		  
		  
		  TreeSet<Employee> employees=new TreeSet<Employee>();
		  
		  employees.add(Mickey);
		  employees.add(Donald);
		  employees.add(Bugs);
		  employees.add(Max);
		  
		  for(Employee emp:employees)
		  {
			  System.out.println(emp.GetId());
		  }
		  
		  Set<Employee> emp2=new TreeSet<Employee>(new givenNameCompare());
		  emp2.add(Mickey);
		  emp2.add(Donald);
		  emp2.add(Bugs);
		  emp2.add(Max);
		  
		  for(Employee emp:emp2)
		  {
			  System.out.println(emp.GetGivenName());
		  }
		  Set<Employee> emp3=new TreeSet<Employee>(new givenNameCompare());
		  emp3.add(Mickey);
		  emp3.add(Donald);
		  emp3.add(Bugs);
		  emp3.add(Max);
		  
		  for(Employee emp:emp3)
		  {
			  System.out.println(emp.GetSalary());
		  }
		  
		
	}

}
