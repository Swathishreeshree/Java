package TempConvo;

public class TempConvoApp {

	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(68.0));

	}

}
