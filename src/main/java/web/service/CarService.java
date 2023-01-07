package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

@Component
public class CarService {

    private static List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public static void getList() {
        Car car1 = new Car("kia", 2);
        Car car2 = new Car("hyundai", 2);
        Car car3 = new Car("bmw", 2);
        Car car4 = new Car("mers", 2);
        Car car5 = new Car("chevr", 2);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    public static List<Car> getCars(Integer count) {
        getList();
        if(count == null) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }

}
