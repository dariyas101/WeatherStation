public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer weatherDisplay = new WeatherDisplay();
        weatherStation.registerObserver(weatherDisplay);

        weatherStation.setTemperature(40f);

        WeatherDisplayDeviceFactory mobileFactory = new MobileWeatherDisplayFactory();
        WeatherDisplayDevice mobileDisplay = mobileFactory.createWeatherDisplayDevice();
        mobileDisplay.display(); // Output: Mobile Weather Display

        WeatherDisplayDeviceFactory desktopFactory = new DesktopWeatherDisplayFactory();
        WeatherDisplayDevice desktopDisplay = desktopFactory.createWeatherDisplayDevice();
        desktopDisplay.display(); // Output: Desktop Weather Display
    }
}
