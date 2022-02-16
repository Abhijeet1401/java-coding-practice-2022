import java.util.Scanner;

public class CalculatePercentage {

	 double obtained;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter subject 1st mark :");
		double S1 = sc.nextDouble();
		System.out.print("enter subject 2nd mark :");
		double S2 = sc.nextDouble();
		System.out.print("enter subject 3rd mark :");
		double S3 = sc.nextDouble();
		System.out.print("enter subject 4th mark :");
		double S4 = sc.nextDouble();
		System.out.print("enter subject 5th mark: ");
		double S5= sc.nextDouble();
		System.out.println("enter total marks");
		int total= sc.nextInt();
		double obtained = S1+S2+S3+S4+S5;
		double percentage = (obtained*100)/total;
		System.out.println("percentage marks obtained by student:"+percentage);
	}

}
