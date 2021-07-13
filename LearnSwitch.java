package week1.day1;

public class LearnSwitch {

	public static void main(String[] args) {
		int a=2,b=3;
		//int c=a+b;
		String var="add";
		//a+b=5;
		switch (var) 
		{
		case "add":
			System.out.println(5);
			break;
		case "sub":
			System.out.println(-1);
			break;
		case "div":
			System.out.println(1);
			break;
		case "mul":
			System.out.println(6);
			break;

		default:
			System.out.println(0);
			break;
		}
		System.out.println("added value:" +(a+b));
		
	}

}
