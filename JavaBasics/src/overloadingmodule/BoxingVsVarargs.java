package overloadingmodule;

public class BoxingVsVarargs {

    void call(Integer i) {
        System.out.println("Boxed Integer");
    }

    void call(int... nums) {
        System.out.println("Varargs");
    }

    public static void main(String[] args) {
        // call(10);  ✅ Allowed but potentially ambiguous
    	BoxingVsVarargs bv = new BoxingVsVarargs();
    	bv.call(1);
    	bv.call(1,3,3);
    	
    }
}