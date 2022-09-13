package ua.ithillel.hillelwebapp.servise;

import ua.ithillel.hillelwebapp.db.dao.CarDAO;
import ua.ithillel.hillelwebapp.entity.Car;

import java.util.List;

public class CarService {

    private CarDAO carDAO = new CarDAO();

    public List<Car> getAllCars() {
        return carDAO.findAll();
    }

    public void createCar(Car car) {
        carDAO.save(car);
    }

    public void updateCar(Car car) {
        carDAO.update(car);
    }

    public Car findById(int carId) {
        return carDAO.findById(carId);
    }

    public void deleteCar(Car car) {
        carDAO.delete(car);
    }
}
