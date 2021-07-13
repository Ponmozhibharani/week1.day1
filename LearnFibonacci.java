package week1.day1;

public class LearnFibonacci {

	public static void main(String[] args) {
		int firstNum = 0, secNum = 1;
		int range = 8, sum;
		System.out.println("Range:" + range);
		System.out.println("************");

		for (int i = 1; i <= range; i++) {
			System.out.println(firstNum + ":Fibonacci Number");
			System.out.println("************");
			sum = firstNum + secNum;
			System.out.println("sum:" + sum);
			firstNum = secNum;
			System.out.println("FirstNum:" + firstNum);
			secNum = sum;
			System.out.println("secNum:" + secNum);
			System.out.println("*****************");

		}

	}

}
