package question2;

public class HelloWorld_withParam {

	public static void main(String[] args) {
		try{
			String str = "Hello Wrold: " + args[0];
			System.out.println(str);
		}catch(ArrayIndexOutOfBoundsException e){
			{
				System.out.println("Missing arguments");
			}
		}
	}

}
