package AbstractFactory.Car.factory;

import AbstractFactory.Car.services.CarEJBService;
import AbstractFactory.Car.services.CarService;
import AbstractFactory.Car.services.UserEJBService;
import AbstractFactory.Car.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

}
