package ui;

import domain.Car;

public class RacingDrawing {
  private static final String RUN_ONE_STEP = "-";

  public RacingDrawing(Car[] cars) {
    System.out.println();
      for(Car car : cars){
        System.out.println(car.getName() + " : " + drawBar(car.getRunCount()));
      }
  }

  private String drawBar(Integer count){
    String draw = "";

    for(int i = 0; i < count; i++ ){
      draw += RUN_ONE_STEP;
    }

    return draw;
  }
}
