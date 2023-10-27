public class MobileWeatherDisplayFactory implements WeatherDisplayDeviceFactory {
    @Override
    public WeatherDisplayDevice createWeatherDisplayDevice() {
        return new MobileWeatherDisplay();
    }
}
