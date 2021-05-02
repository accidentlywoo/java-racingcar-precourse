package ui;

import generator.CarGroupGenerator;
import generator.RaceGenerator;

import java.util.Scanner;

public class ConsoleInputOutController {
	private final Scanner scanner = new Scanner(System.in);

	public void run() {
		boolean flag = true;

		while (flag){
			System.out.println(ConsoleInputOutMessage.ASK_RACING_CAR_NAME);

			boolean carNameCheck = carNameCheck(scanner.nextLine().trim());

			flag = racingCount(scanner.nextLine().trim(), carNameCheck);
		}
	}

	private boolean carNameCheck(String inputCarNames){
		try{
			new CarGroupGenerator(inputCarNames);
		}catch (IllegalArgumentException e){
			System.out.println(e);
			return false;
		}
		return true;
	}

	private boolean racingCount(String inputCarNames, boolean flag){
		if(!flag){
			return false;
		}

		System.out.println(ConsoleInputOutMessage.ASK_RACING_COUNT);

		new RaceGenerator(inputCarNames);

		System.out.println(ConsoleInputOutMessage.RACING_RESULT_MESSAGE);
		// TODO 레이싱 뷰 뿌리기
		System.out.println(ConsoleInputOutMessage.WINNER_SURFIX_MESSAGE);

		return true;
	}
}
