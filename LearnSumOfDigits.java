package week1.day1;

public class LearnSumOfDigits {

	public static void main(String[] args) {
		
int i=123,sum=0;
while(i>0) {
int rem=i%10;
System.out.println("Reminder:" +rem);
sum=rem+sum;
System.out.println("Sum:" +sum);
int quot=i/10;
i=quot;
System.out.println("Quotient:" +i);
	}
System.out.println("Final sum:" +sum);

}
}