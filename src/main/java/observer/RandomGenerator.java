package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    // 관찰자(Observer)들의 목록
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void run() {
        int num = new Random().nextInt(50);
        observers.forEach(observer -> observer.update(num));
    }
}
