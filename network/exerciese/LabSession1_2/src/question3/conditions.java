package question3;

public class conditions {

	public static void checkValue(int x, int y)
	{
		if (x > y)
		{
			int t = x;
			y = x;
			x = t;
			System.out.println("x = " + x + " and y = " + y);
		}
		else
			System.out.println("Have a nice day!");
	}
	public static void main(String[] args) {
		int x, y;
		x = 6;
		y = 9;
		checkValue(x, y);
		
		x = 5;
		y = 2;
		checkValue(x, y);
		

	}

}
