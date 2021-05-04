package ui;

import generator.CarGroupGenerator;
import generator.RaceGenerator;
import util.CarNameConstant;
import validation.InputValidator;

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

      flag = carNameCheck ? racingCount(scanner.nextLine().trim()) : carNameCheck;
    }
  }

  private boolean carNameCheck(String inputCarNames){
    try{
      final String[] cars = inputCarNames.split(CarNameConstant.SPLIT_CAR_NAME);

      InputValidator.carNamecheck(cars);

      carGroupGenerator = new CarGroupGenerator(cars);

    }catch (IllegalArgumentException e){
      System.out.println(e);

      return false;
    }
    return true;
  }

  private boolean racingCount(String inputCarNames){
    countCheck(inputCarNames);

    return true;
  }

  private void countCheck(String inputCount){
    try{
      RaceGenerator raceGenerator = new RaceGenerator(InputValidator.countCheck(inputCount), carGroupGenerator.getRaceCarGroup());

      System.out.println(ConsoleInputOutMessage.RACING_RESULT_MESSAGE);

      raceGenerator.run();

	    System.out.println(raceGenerator.getWinRaceCar() + ConsoleInputOutMessage.WINNER_SURFIX_MESSAGE);

    }catch (IllegalArgumentException e){
      System.out.println(e);
    }
  }
}
