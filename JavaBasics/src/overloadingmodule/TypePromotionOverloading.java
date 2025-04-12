package overloadingmodule;

/*
 * same no of arguments but different data types also do type promotion
 */
public class TypePromotionOverloading {

	void print(int a, float f) {
		System.out.println("int float version" + a + f);
	}

	void print(float f, double d) {
		System.out.println("float double version" + f + d);
	}

	public static void main(String[] args) {
		TypePromotionOverloading tp = new TypePromotionOverloading();
		tp.print(14, 12.3f);
		tp.print(13.5f, 43240.30006);
	}
}
