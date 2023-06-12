package CreationalPattern.AbstractFactory.apple.abstractFactory;


import CreationalPattern.AbstractFactory.apple.model.certificate.Certificate;
import CreationalPattern.AbstractFactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
