package accountApplication;

public class Main {

	public static void main(String[] args) {
		// This is the main function that I need to write
		
		/*System.out.println("Hello World");
		
		Account accSean = new Account("Sean","Murray",101);
		Account accRosie = new Account("Rosie","Muir",102);
		Service serv = new Service();
		serv.addAccount(accSean);
		serv.addAccount(accRosie);
		
		System.out.println((serv.getAccount(101)).toString());
	*/
		
		Account accSean = new Account("Sean","Murray",101);
		Account accRosie = new Account("Rosie","Muir",102);
		System.out.println(accSean.toJSONObject());
		Service serv = new Service();
		serv.addAccount(accSean);
		serv.addAccount(accRosie);
		System.out.println(serv.jobj());
		System.out.println(serv.getFirstNameCount("Sean"));
	}
}
