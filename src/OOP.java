
public class OOP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start Here!");

//		create a new bear
		Bear bear = new Bear();
		
		printout(bear);
		
	}
	
	public static void printout(Bear bear) {
		System.out.println();
		System.out.println("###############");
		System.out.println("Age: " + bear.age);
	}

}
