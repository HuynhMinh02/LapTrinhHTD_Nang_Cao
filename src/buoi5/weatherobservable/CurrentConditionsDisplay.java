package buoi5.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    Observable observable;
    private float temperature, humidity;

    
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }



    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
        
    }
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
    
}
