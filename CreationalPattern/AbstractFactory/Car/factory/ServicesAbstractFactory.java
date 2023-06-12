package CreationalPattern.AbstractFactory.Car.factory;

import CreationalPattern.AbstractFactory.Car.services.CarService;
import CreationalPattern.AbstractFactory.Car.services.UserService;

public interface ServicesAbstractFactory {

    UserService getUserService();

    CarService getCarService();
}
