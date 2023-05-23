package AbstractFactory.Car.factory;

import AbstractFactory.Car.services.CarService;
import AbstractFactory.Car.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();
}
