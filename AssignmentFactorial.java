package week1.day1;

public class AssignmentFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;  //i/p=5; --->5*4*3*2*1=120   //n!=n*(n-1)!
int i,fact=1;
for( i = 1; i <= n; i++) {
	fact=fact*i;
	System.out.println("fact:" +fact);
	}
System.out.println("factorial of "+n+" is:" +fact);

}
}