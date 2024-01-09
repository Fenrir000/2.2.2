package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(123, "afdm", 123));
        cars.add(new Car(125, "affm", 12467));
        cars.add(new Car(159, "afdfgm", 124));
        cars.add(new Car(170, "affmsdfsd", 1245646));
        cars.add(new Car(179, "affmsdfssdsd", 124564796));
    }

    public List<Car> getCars(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else if (number >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, number);
        }
    }
}
