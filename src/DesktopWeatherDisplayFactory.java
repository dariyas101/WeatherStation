public class DesktopWeatherDisplayFactory implements WeatherDisplayDeviceFactory {
    @Override
    public WeatherDisplayDevice createWeatherDisplayDevice() {
        return new DesktopWeatherDisplay();
    }
}
