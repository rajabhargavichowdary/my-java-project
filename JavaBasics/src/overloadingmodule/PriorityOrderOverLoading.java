package overloadingmodule;
/*
 * This is Priority overloading here we deal with priority based on availability of called method with argument type
 * Exact match --> Widening (auto promotion of data types )--> Boxing (to corresponding wrapper class) --> var args (multiple no of parameters)  
 */
public class PriorityOrderOverLoading {

	void priorityOrder(int x) {
		System.out.println("Frist priority is for Exact Match");
	}

	void priorityOrder(long x) {
		System.out.println("Second priority is for Widning which is byte-->short-->int-->long l-->float f-->double");
	}

	void priorityOrder(Integer x) {
		System.out.println("3 . Boxing that is from primitive type to wrapper class type");
	}

	void priorityOrder(int... x) {
		System.out.println("4. varargs is of type int any number of int values are taken here");
	}

	void classDefination() {
		System.out.println("This class demos the priority order in overloading in java");
	}

	public static void main(String[] args) {
		PriorityOrderOverLoading po = new PriorityOrderOverLoading();
		po.classDefination();
		SubClassData scd = new SubClassData();
		scd.greetings("s","b");
		po.priorityOrder(05);
	}
}
