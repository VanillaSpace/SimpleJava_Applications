package MidtermQ2;

public class employeeDataException extends Exception{
	
	public employeeDataException(int code)
	{
		if(code==1)
			System.out.println("EmployeeDataException code 1 – invalid id  (id less or equal to zero)");
		else if(code==2)
			System.out.println("EmployeeDataException code 2 – invalid name");
		else if (code==3)
			System.out.println("EmployeeDataException code 3 – invalid givenName");
		else if(code==4)
			System.out.println("EmployeeDataException code 4 – invalid salary (salary less than zero)");
		
	}

}
