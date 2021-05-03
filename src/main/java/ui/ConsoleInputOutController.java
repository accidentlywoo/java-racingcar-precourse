package ui;

import generator.CarGroupGenerator;
import generator.RaceGenerator;

import java.util.Scanner;

public class ConsoleInputOutController {
  private final Scanner scanner = new Scanner(System.in);
  private CarGroupGenerator carGroupGenerator;

  public void run() {
    boolean flag = true;

    while (flag){
      System.out.println(ConsoleInputOutMessage.ASK_RACING_CAR_NAME);

      boolean carNameCheck = carNameCheck(scanner.nextLine().trim());

      System.out.println(ConsoleInputOutMessage.ASK_RACING_COUNT);

      flag = racingCount(scanner.nextLine().trim(), carNameCheck);
    }
  }

  private boolean carNameCheck(String inputCarNames){
    try{
      carGroupGenerator = new CarGroupGenerator(inputCarNames);

    }catch (IllegalArgumentException e){

      System.out.println(e);

      return false;
    }
    return true;
  }

  private boolean racingCount(String inputCarNames, boolean flag){
    if(!flag){
      return true;
    }

    countCheck(inputCarNames);

    return flag;
  }

  private void countCheck(String inputCount){
    try{
      new RaceGenerator(inputCount, carGroupGenerator.getRaceCarGroup());

    }catch (IllegalArgumentException e){

      System.out.println(e);
    }

    printView();
  }

  private void printView(){
    System.out.println(ConsoleInputOutMessage.RACING_RESULT_MESSAGE);

		// TODO 레이싱 뷰 뿌리기
    System.out.println(ConsoleInputOutMessage.WINNER_SURFIX_MESSAGE);
  }
}
