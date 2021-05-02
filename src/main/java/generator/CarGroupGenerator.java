package generator;

import domain.Car;
import domain.RaceCarGroup;
import util.RaceConstant;
import validation.InputValidator;

public class CarGroupGenerator {
	private final int carGroupLength;
	private final RaceCarGroup raceCarGroup;

	public CarGroupGenerator(String carsString) {
		final String[] cars = carsString.split(RaceConstant.SPLIT_CAR_NAME);

		InputValidator.carNamecheck(cars);

		carGroupLength = cars.length;

		raceCarGroup = new RaceCarGroup(carGroupLength);

		createCars(cars);
	}

	public void createCars(String[] cars){
		for (int i = 0; i < carGroupLength; i++){
			raceCarGroup.putCarInGroup(new Car(cars[i]), i);
		}
	}
}
