public class Display implements Observe{

    @Override
    public void OnUpdateTemperature(float temperature) {
        System.out.println("Temperature: " + temperature);
    }
    
    
    @Override
    public void OnUpdatePressure(float pressure) {
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void OnUpdateHumidity(float humidity) {
        System.out.println("Humidity: " + humidity);
    }
}