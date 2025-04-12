package overloadingmodule;

public class DifferentParameterOrderOverloading {
	void vehical(int number, String name) {
		System.out.println("vehical number:"+ number + " Vehical name: "+name);
	}
	void vehical(String name, int number) {
		System.out.println("Vehical name :"+ name + "Vehical number"+ number);
	}
	public static void main(String [] args) {
		DifferentParameterOrderOverloading order = new DifferentParameterOrderOverloading();
		order.vehical(555, "Volvo");
		order.vehical("Toyota", 1789);
		
	}

}
