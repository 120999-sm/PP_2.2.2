package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarServiceImpl implements CarService {
    private static final List<Car> cars = new ArrayList<>();

    static {
       cars.add(new Car("Land Rover", "Defender", "2020"));
       cars.add(new Car("BMW", "3-series", "2018"));
       cars.add(new Car("Mercedes-Benz", "C200", "2016"));
       cars.add(new Car("Toyota", "Land Cruiser 300", "2020"));
       cars.add(new Car("Nissan", "GT-R (R35)", "2018"));
    }
    public List<Car> getCars(int count) {
       if (count == 0) { return cars; }

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
