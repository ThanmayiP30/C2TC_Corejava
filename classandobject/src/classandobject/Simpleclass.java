package classandobject;

public class Simpleclass {
int x;
}
class testclass{
	public static void main(String[]args)
	{
		Simpleclass myobj =new Simpleclass();
		myobj.x=4;
		System.out.println(myobj.x);
	}
}