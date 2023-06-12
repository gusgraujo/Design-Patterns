package CreationalPattern.AbstractFactory.Car;

import CreationalPattern.AbstractFactory.Car.factory.EJBAbstractFactory;
import CreationalPattern.AbstractFactory.Car.factory.ServicesAbstractFactory;
import CreationalPattern.AbstractFactory.Car.services.CarService;
import CreationalPattern.AbstractFactory.Car.services.UserService;

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
