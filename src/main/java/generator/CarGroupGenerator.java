package generator;

import domain.Car;
import domain.CarGroup;
import util.CarNameConstant;
import validation.InputValidator;

public class CarGroupGenerator {
	private final int carGroupLength;
	private final CarGroup raceCarGroup;

	public CarGroupGenerator(String carsString) {
		final String[] cars = carsString.split(CarNameConstant.SPLIT_CAR_NAME);

		InputValidator.carNamecheck(cars);

		carGroupLength = cars.length;

		raceCarGroup = new CarGroup(carGroupLength);

		createCars(cars);
	}

	public void createCars(String[] cars){
		for (int i = 0; i < carGroupLength; i++){
			raceCarGroup.putCarInGroup(new Car(cars[i]), i);
		}
	}

	public CarGroup getRaceCarGroup() {
		return raceCarGroup;
	}
}
