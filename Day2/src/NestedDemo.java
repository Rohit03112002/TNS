
public class NestedDemo {

	public static void main(String[] args) {

		int a=50 , b=200, c=12;
		System.out.println("The largest Number is ");
		
		
		if(a>b) 
		{
			if (a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else {
			if(c>b)
				System.out.println(c);
			else
				System.out.println(b);
		}
		
		
	}








}
