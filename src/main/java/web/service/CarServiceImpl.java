package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static List<Car> cars;

    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public void getList() {
        cars.add(new Car("kia", 2));
        cars.add(new Car("hyundai", 2));
        cars.add(new Car("bmw", 2));
        cars.add(new Car("mers", 2));
        cars.add(new Car("chevr", 2));
    }

    @Override
    public List<Car> getCars(Integer count) {
        getList();
        if(count == null) {
            return cars;
        }
        return cars.stream().limit(count).toList();
    }

}
