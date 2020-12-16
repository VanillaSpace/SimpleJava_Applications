package MidtermQ2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private String givenName;
	private double salary;
	
	public int GetId()
	{
		return id;
	}
	public String GetName()
	{
		return name;
	}
	public String GetGivenName()
	{
		return givenName;
	}
	public double GetSalary()
	{
		return salary;
	}
	public void SetSalary(double salary)
	{
		this.salary=salary;
	}
	@Override
	public int compareTo(Employee e) {	
		return this.id-e.id;       
	}
	
	public Employee(int id,String name,String givenName,double salary) throws employeeDataException
	{
		Pattern pattern = Pattern.compile("[a-zA-Z\s-]*");
		Matcher matcherGivenName=pattern.matcher(givenName);
		Matcher matcherName=pattern.matcher(name);
		
		if(salary>0)
			this.salary=salary;
		else 
			throw new employeeDataException(4);
		if(matcherGivenName.matches())
			this.givenName=givenName;
		else
			throw new employeeDataException(3);
		if(matcherName.matches())
			this.name=name;
		else 
			throw new employeeDataException(2);
		if(id>0)
		this.id=id;
		else
			throw new employeeDataException(1);
	}
	


}
