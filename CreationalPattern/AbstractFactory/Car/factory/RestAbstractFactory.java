package CreationalPattern.AbstractFactory.Car.factory;

import CreationalPattern.AbstractFactory.Car.services.CarRestApiService;
import CreationalPattern.AbstractFactory.Car.services.CarService;
import CreationalPattern.AbstractFactory.Car.services.UserRestApiService;
import CreationalPattern.AbstractFactory.Car.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

}
