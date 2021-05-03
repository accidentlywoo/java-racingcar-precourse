package generator;

import domain.Car;
import domain.CarGroup;
import ui.RacingDrawing;

import java.util.ArrayList;
import java.util.List;

public class RaceGenerator {
  private final Integer count;
  private final CarGroup carGroup;

  public RaceGenerator(Integer count, CarGroup carGroup) {
    this.count = count;
    this.carGroup = carGroup;
  }

  public void run() {
    final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(carGroup);
    CarGroup cars;

    for (int i = 0; i < count; i ++){
      cars = randomNumberGenerator.gogoCar();

      new RacingDrawing(cars.getCars());
    }
  }

  public List<String> getWinner(){
    List<String> result = new ArrayList<>();

    int max = 0;

    for(Car car : carGroup.getCars()){
      max = car.getRunCount() > max ?
              car.getRunCount() : max;

      if (car.getRunCount() == max) {
        result.add(car.getName());
      }
    }
    return result;
  }
}
