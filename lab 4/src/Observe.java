public interface Observe {
    void OnUpdateTemperature(float temperature);
    void OnUpdatePressure(float pressure);
    void OnUpdateHumidity(float humidity);
}
