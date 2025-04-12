package ocjpFundamentals;

public class ArrayaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x= new  int[12];
		int[] y = {4,5,6,7,8,9,90,4,3};
		int     Z[] = {4,5,6,7,8,9,90,4,3};
		int [][] sd = new int[2][2];
		int[][][] sfsd = {{{1,32,312,2},{2,32,2321,1},{32,54,787,8}},{{4332,434,234,234},{432,432,3424,2}}};
		String[] sddd= {"dfsdfsd","sdsa"};
		for(int i=0; i<y.length; i++) {// length is a variable only to get array length , where lenght() is
			//length method used to find the length of string
			x[i]= i+1;
			//System.out.println("Array X elements "+ x[i]);
			System.out.println("Array y elements "+ Z[i]);
			//#new int [] {1,2,3,3};
		}
		String s = "Rajabhargavi";
		System.out.println("My name length is :"+ s.length()); // length method is present in String class, 
		//String class is final class , every method present in final class is final method , you can not override
		//final method .if string is array then also not applicable . 
		
	}

}
