package AbstractFactory.Car;

import AbstractFactory.Car.factory.EJBAbstractFactory;
import AbstractFactory.Car.factory.ServicesAbstractFactory;
import AbstractFactory.Car.services.CarService;
import AbstractFactory.Car.services.UserService;

public class Client {

    public static void main(String[] args) {
        ServicesAbstractFactory factory = new EJBAbstractFactory();
//		ServicesAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Jhon");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Prius");
        carService.update("Tesla X");
    }
}
