import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("====프로그램 시작=========");

		Scanner sc = new Scanner(System.in);
		System.out.printf("명령어 입력 :");

		String command = sc.nextLine().trim();
		System.out.printf("입력되 명령어 : %s\n", command);

		System.out.printf("입력번호:");
		int num = sc.nextInt();
		
		
		System.out.printf("입력된 번호 : %d\n ", num);

		System.out.println("====프로그램끝");
	}
}
