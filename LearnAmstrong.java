package week1.day1;

public class LearnAmstrong {

	public static void main(String[] args) {
		
		int n = 153;  //(1*1*1)+(5*5*5)+(3*3*3)=153; 
		int cal = 0, rem, original;
		original = n;
		while (n > 0) {
			rem = n % 10;
			int quot = n / 10;  //can v also write directly as n=n/10;
			n=quot;
			cal += Math.pow(rem, 3);//cal=cal+(rem*rem*rem);
			System.out.println(rem + ":reminder");
			System.out.println(quot + ":Quotient");
			System.out.println(cal + ":calculated");
			System.out.println("*******************");
		}
		if (cal == original) {
			System.out.println(cal + ":is amstrong number");
		}else
		{
			System.out.println(cal+ ":is not amstrong number");
		}
	}
}
