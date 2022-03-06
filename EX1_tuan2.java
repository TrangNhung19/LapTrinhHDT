package homework_2;
import java.util.Scanner;

public class EX1_tuan2 {
		public static void main(String[] args) {
			System.out.print("tổng của dãy số Fibonacci đến số Fibonacci < 100\n");

			int n;
			Scanner scanner =new Scanner(System.in);
			System.out.print("nhap so n: ");
			n=scanner.nextInt();
			System.out.println("tong cua day so fibonacci = "+tongFibonacci(n));
		}

		public static int tongFibonacci(int n) {
			if (n == 1) {
				return 1;
			} else if (n == 2) {
				return 2;
			} else {
				int sum=0;
				int a[] =new int[n];
				a[0]=a[1]=1;
				for(int i=2;i<n;i++) {
					a[i]=a[i-1]+a[i-2];
					sum+=a[i];
				}
				
				return sum+2;
			}
		}
	}

