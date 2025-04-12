package overloadingmodule;
/*
 * Basic overloading
 * deals with different types of arguments or number of arguments and order of the arguments 
 * in overloading method access modifiers and return type does not matter
 */
public class AdditionOverloading {
	
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int a,int b, int c) {
		return a+b+c;
	}
	public double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String [] args) {
		AdditionOverloading ad = new AdditionOverloading();
		System.out.println("add int:"+ ad.add(2, 4));
		System.out.println("add int 3params:"+ ad.add(2, 4,6));
		System.out.println("add double:"+ ad.add(2.3f, 4.45f)); // this is called auto widening or auto promotion int --> long l 
		// --> float f --> double d
	}

}
