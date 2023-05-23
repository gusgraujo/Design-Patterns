package AbstractFactory.apple;


import AbstractFactory.apple.abstractFactory.CountryRulesAbstractFactory;
import AbstractFactory.apple.model.iphone.IPhone;
import AbstractFactory.apple.model.iphone.IPhoneX;
import AbstractFactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
