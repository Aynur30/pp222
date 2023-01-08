package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void getList();

    List<Car> getCars(Integer count);
}
