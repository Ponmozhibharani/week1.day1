package week1.day1;

public class LearnPrime {

	public static void main(String[] args) {

		int n = 13; /*
					 * doesnt divisble by any num, 
					 * it can divisble by 1 and that num itself.
					 * reminder shld be 0
					 */
		boolean flag = false;
		for (int i = 2; i <= n / 2; i++) 
		{
			if (n % i == 0) {   //(13/2==0)---->(1==0)--->condi false,so loop break
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("number is not prime num:" + n);
		} else {
			if (flag == false)
				System.out.println("number is prime num:" + n);

		}
	}

}
