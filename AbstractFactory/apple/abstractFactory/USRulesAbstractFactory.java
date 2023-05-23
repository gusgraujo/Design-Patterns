package AbstractFactory.apple.abstractFactory;

import AbstractFactory.apple.model.certificate.Certificate;
import AbstractFactory.apple.model.certificate.USCertificate;
import AbstractFactory.apple.model.packing.Packing;
import AbstractFactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
