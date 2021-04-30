package ui;

import generator.CarGroupGenerator;
import generator.RaceGenerator;

import java.util.Scanner;

public class ConsoleInputOutController {
	private final Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println(ConsoleInputOutMessage.ASK_RACING_CAR_NAME);
		new CarGroupGenerator(scanner.nextLine().trim());

		System.out.println(ConsoleInputOutMessage.ASK_RACING_COUNT);
		new RaceGenerator(scanner.nextLine().trim());

		System.out.println(ConsoleInputOutMessage.RACING_RESULT_MESSAGE);
		// TODO 레이싱 뷰 뿌리기
		System.out.println(ConsoleInputOutMessage.WINNER_SURFIX_MESSAGE);
	}
}
