package question4;

public class PowersOfTwo {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		for(int i = 0, v = 1; i <= N; i++, v = 2*v)
		{
			System.out.println(i + " " + v);
		}
	}
}
/*
output:
		0 1
		1 2
		2 4
		3 8
		4 16
		5 32
		6 64
*/