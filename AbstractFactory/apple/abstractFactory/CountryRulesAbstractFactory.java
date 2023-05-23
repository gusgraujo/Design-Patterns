package AbstractFactory.apple.abstractFactory;


import AbstractFactory.apple.model.certificate.Certificate;
import AbstractFactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
