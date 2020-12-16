package MidtermQ1;

import java.util.ArrayList;

public class starfleet {
	
	// Question 1 - Part 4
	public static ArrayList<Captain> captains=new ArrayList<Captain>();
	public static ArrayList<Vessel> vessels=new ArrayList<Vessel>();
	
	public enum TypeOfShip{stellarBase,ship}
	
	
	// Question 1 - Part 1
	public static class Captain{
		private String name;
		private Vessel vessel;
		
		public Captain(String name)
		{
			this.name=name;
			captains.add(this);
		}
		
		public String GetName()
		{
			return name;
		}
		public String GetVesselName()
		{
			if(vessel!=null)
			return vessel.GetName();
			else
				return "Missing Vessel";
		}
		
		
	}
	
	// Question 1 - Part 2
	public static class Vessel{ 
		private String name;
		private TypeOfShip type;
		private Captain captain;
		
		public Vessel(String name,TypeOfShip type)
		{
			this.name=name;
			this.type=type;
			vessels.add(this);
		}
		public TypeOfShip GetType()
		{
			return type;
		}
		public String GetName()
		{
			return name;
		}
		public String GetCaptainName()
		{
			if(captain!=null)
			return captain.GetName();
			else 
				return "Missing Captain";
		}
		
	}
	
	// Question 1 - Part 3
	public static void AssignCaptain(Vessel vessel,Captain captain)
	{
		vessel.captain=captain;
		captain.vessel=vessel;
	}
	
	// Question 1 - Part 5
	public static void remove(Captain captain)
	{		
	captains.remove(captain);
	captain.vessel.captain=null;
	captain.vessel=null;
	}
	public static void remove(Vessel vessel)
	{
     vessels.remove(vessel);
     vessel.captain.vessel=null;
     vessel.captain=null;
	}
	
	
}

