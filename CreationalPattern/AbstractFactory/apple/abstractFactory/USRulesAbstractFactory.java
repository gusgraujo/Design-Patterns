package CreationalPattern.AbstractFactory.apple.abstractFactory;

import CreationalPattern.AbstractFactory.apple.model.certificate.Certificate;
import CreationalPattern.AbstractFactory.apple.model.certificate.USCertificate;
import CreationalPattern.AbstractFactory.apple.model.packing.Packing;
import CreationalPattern.AbstractFactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
