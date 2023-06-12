package CreationalPattern.AbstractFactory.Car.factory;

import CreationalPattern.AbstractFactory.Car.services.CarEJBService;
import CreationalPattern.AbstractFactory.Car.services.CarService;
import CreationalPattern.AbstractFactory.Car.services.UserEJBService;
import CreationalPattern.AbstractFactory.Car.services.UserService;

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
