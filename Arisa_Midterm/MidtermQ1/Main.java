package MidtermQ1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Question 1 - Part 6 (Examples)
		  starfleet.Captain JeanLuc=new starfleet.Captain("JeanLuc");
		  starfleet.Vessel enterprise=new starfleet.Vessel("Enterprise",starfleet.TypeOfShip.ship);
		  starfleet.AssignCaptain(enterprise, JeanLuc);
		  
		  System.out.println("Captain "+ JeanLuc.GetName()+ " commands the vessel "+ JeanLuc.GetVesselName());
		  System.out.println("The vessel "+ JeanLuc.GetVesselName() + " is a type of "+ enterprise.GetType() +" and it is commanded by Captain "+ JeanLuc.GetName());
		  
		  
		  starfleet.Captain BenjaminS=new starfleet.Captain("Benjamin Sisco");
		  starfleet.Vessel DeepSpace=new starfleet.Vessel("Deep Space 9",starfleet.TypeOfShip.stellarBase);
		  starfleet.AssignCaptain(DeepSpace, BenjaminS);
		  
		  System.out.println("The vessel "+ BenjaminS.GetVesselName() + " is a type of "+ DeepSpace.GetType() +" and it is commanded by Captain "+ BenjaminS.GetName());
		  		  
		  starfleet.Captain KatherineJ=new starfleet.Captain("Katherine Janeway");
		  starfleet.Vessel Voyageur=new starfleet.Vessel("Voyageur",starfleet.TypeOfShip.ship);
		  starfleet.AssignCaptain(Voyageur, KatherineJ);
		  
		  System.out.println("The vessel "+ KatherineJ.GetVesselName() + " is a type of "+ Voyageur.GetType() +" and it is commanded by Captain "+ KatherineJ.GetName());
		
		  //Overload Method 
		  System.out.println("Testing to see if overload method works by removing Kathrine Janeway...");
		  starfleet.remove(KatherineJ); 
		  System.out.println(KatherineJ.GetVesselName());
		  System.out.println(Voyageur.GetCaptainName());
	}

}
