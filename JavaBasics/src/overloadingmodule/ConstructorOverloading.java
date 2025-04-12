package overloadingmodule;
/*
 * constructor overloading
 */
public class ConstructorOverloading {
	int a;
	String n;
	
	ConstructorOverloading(){
		a =0;
		n= "unknown";
	}
	ConstructorOverloading(String n){
		a=0;
		this.n = n;
	}
	ConstructorOverloading(int a, String n){
		this.a = a;
		this.n = n;
	}
	void display() {
        System.out.println(n + " - " + a);
    }
	public static void main(String [] args) {
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading cos = new ConstructorOverloading("ARB");
		ConstructorOverloading cons = new ConstructorOverloading(29, "Arb");
		co.display();
		cos.display();
		cons.display();
	}
	
}
