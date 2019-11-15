package honux.calandar;

import java.util.Scanner;

public class Prompt {
	
	public int StartWeekday(String weekday) {
		if(weekday.equals("SU")) return 0;
		else if(weekday.equals("MO")) return 1;
		else if(weekday.equals("TU")) return 2;
		else if(weekday.equals("WE")) return 3;
		else if(weekday.equals("TH")) return 4;
		else if(weekday.equals("FR")) return 5;
		else if(weekday.equals("SA")) return 6;
		else return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = -1;
		String weekday = " ";
		
		while (true) {
			System.out.println("년도를 입력하세요.(exit: -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year == -1)
				break;
			
			System.out.println("월을 입력하세요.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			weekday = scanner.next();
			
			cal.printCalender(year, month, StartWeekday(weekday));
		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {

		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
