public interface Object {
    void subscribe(Observe o);
    void unsubscribe(Observe o);
    void updateTemperature();
    void updatePressure();
    void updateHumidity();
}

