package ua.ithillel.hillelwebapp.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import ua.ithillel.hillelwebapp.entity.Car;
import ua.ithillel.hillelwebapp.serviсe.CarService;

import java.util.List;

@Path("/cars")
public class CarRestService {

    private CarService carService = new CarService();

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Car> getCars() {
        return carService.getAllCars();
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCar(Car car) {
        carService.createCar(car);
    }

    @PUT
    @Path("/modify")
    @Produces(MediaType.APPLICATION_JSON)
    public void modifyCar(Car car) {
        carService.updateCar(car);
    }

    @DELETE
    @Path("/delete/{id}")
    public void deleteCar(@PathParam("id") int carId) {
        Car carToDelete = carService.findById(carId);
        carService.deleteCar(carToDelete);
    }
}
