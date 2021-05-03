package generator;

import domain.Car;
import domain.CarGroup;

import java.util.Random;

import static util.RacingNumberConstant.*;

public class RandomNumberGenerator {
  CarGroup carGroup;

  public RandomNumberGenerator(CarGroup raceCarGroup) {
    this.carGroup = raceCarGroup;
  }

  public void gogoCar(){
    final Car[] carList = carGroup.getCars();
    for(Car car : carList){

      Random random = new Random();

      int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;

      car.plusRunCount(randomNumber > EDGE_NUMBER_OF_GO ? GO : STOP);
    }
  }
}
