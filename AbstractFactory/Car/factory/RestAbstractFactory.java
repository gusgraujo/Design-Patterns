package AbstractFactory.Car.factory;

import AbstractFactory.Car.services.CarRestApiService;
import AbstractFactory.Car.services.CarService;
import AbstractFactory.Car.services.UserRestApiService;
import AbstractFactory.Car.services.UserService;

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
