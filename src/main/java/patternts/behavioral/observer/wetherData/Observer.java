package patternts.behavioral.observer.wetherData;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
