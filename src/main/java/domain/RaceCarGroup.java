package domain;

public class RaceCarGroup {
	private Car[] cars;

	public RaceCarGroup(Integer carsLength) {
		cars = new Car[carsLength];
	}

	public void putCarInGroup(Car car, Integer index){
		cars[index] = car;
	}
}
