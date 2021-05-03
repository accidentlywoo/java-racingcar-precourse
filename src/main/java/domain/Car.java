package domain;

public class Car {
	private String name;
	private Integer runCount = 0;

	public Car(String name) {
		this.name = name;
	}

	public void plusRunCount(Integer go) {
		this.runCount += go;
	}
}
