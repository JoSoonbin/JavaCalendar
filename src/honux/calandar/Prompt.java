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
		int year = 2019;
		
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
			
			cal.printCalender(year, month);
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
