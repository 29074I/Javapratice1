import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num%4==0) {
			System.out.println("�������� 0�Դϴ�.");
		} else if (num%4==1) {
			System.out.println("�������� 1�Դϴ�.");
		} else if (num%4==2) {
			System.out.println("�������� 2�Դϴ�.");
		} else if (num%4==3) {
			System.out.println("�������� 3�Դϴ�.");
		}else {
			System.out.println("�������� " + num%4 + "�Դϴ�.");
		}

	}

}