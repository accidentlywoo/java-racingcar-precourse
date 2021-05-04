package domain;

import java.util.ArrayList;
import java.util.List;

public class WinRaceCar {
	private List<String> carNames;

	public WinRaceCar(CarGroup carGroup) {
		winnerSetting(carGroup);
	}

	private void winnerSetting(CarGroup carGroup){
		carNames = new ArrayList<>();

		int max = 0;

		for(Car car : carGroup.getCars()){
			max = maxCompare(max, car.getRunCount());
		}

		for(Car car : carGroup.getCars()){
			setWinnerCarNames(max, car);
		}
	}

	private Integer maxCompare(Integer max, Integer carRunCount){
		if(carRunCount > max){
			return carRunCount;
		}
		return max;
	}

	private void setWinnerCarNames(Integer max, Car car){
		if(car.getRunCount() == max){
			carNames.add(car.getName());
		}
	}

	public List<String> getCarNames(){
		return carNames;
	}
}
