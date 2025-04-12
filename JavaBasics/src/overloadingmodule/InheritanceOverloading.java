package overloadingmodule;

public class InheritanceOverloading {
 void greetings() {
	System.out.println("Greeting from top level class");
}

public static void main(String [] args) {
	InheritanceOverloading io = new InheritanceOverloading();
	SubClass sc = new SubClass();
	//SubClassData scd = new SubClassData();
	//scd.greetings("s","b");
	sc.greetings("Subclass from main");
	io.greetings();
}
}
class SubClass extends InheritanceOverloading{
	void greetings(String s){
		System.out.println("sub class greetings overriding top level class"+ s);
	}
}


