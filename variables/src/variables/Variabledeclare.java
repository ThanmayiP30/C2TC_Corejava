package variables;

public class Variabledeclare {
	static int c=30; /*Static variable */
	int a=10;  /*Instance variable*/
	public static void main(String[] args) {
		int b=20; /*Local variable */
		System.out.println(b);
		System.out.println(c);
		Variabledeclare obj=new Variabledeclare(); /*object creation */
		System.out.println(obj.a);
		

	}

}
