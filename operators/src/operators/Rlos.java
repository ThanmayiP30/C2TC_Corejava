package operators;

import java.util.Random;

public class Rlos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand =new Random();
		int i =rand.nextInt(100);
		int j =rand.nextInt(100);
		System.out.println("i="+i);
	     System.out.println("j="+j);
	     System.out.println(((i>10) && (j<10)));


	}

}
