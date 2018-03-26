import java.util.ArrayList;

public class DadaWeather implements Object {
    private float temperature;
    private float pressure;
    private float humidity;
    ArrayList<Observe> subscribers = new ArrayList<Observe>();
    public void setTemperature(int temp){
        temperature = temp;
        this.updateTemperature();
    }
    public void setPressure (int press){
        pressure = press;
        this.updatePressure();
    }
    public void setHumidity (int hum){
        humidity = hum;
        this.updateHumidity();
    }
    
    
    @Override
    public void subscribe(Observe o) {
        subscribers.add(o);
    }
    
    
    @Override
    public void unsubscribe(Observe o) {
        int index = subscribers.indexOf(o);
        subscribers.remove(index);
    }

    @Override
    public void updateTemperature() {
        for(int i=0; i<subscribers.size(); i++) {
            subscribers.get(i).OnUpdateTemperature(temperature);
        }
    }

    @Override
    public void updatePressure() {
        for(int i=0; i<subscribers.size(); i++) {
            subscribers.get(i).OnUpdatePressure(pressure);
        }
    }

    @Override
    public void updateHumidity() {
        for(int i=0; i<subscribers.size(); i++) {
            subscribers.get(i).OnUpdateHumidity(humidity);
        }
    }
}