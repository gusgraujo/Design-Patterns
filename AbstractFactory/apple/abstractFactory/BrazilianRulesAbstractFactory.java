package AbstractFactory.apple.abstractFactory;

import AbstractFactory.apple.model.certificate.BrazilianCertificate;
import AbstractFactory.apple.model.certificate.Certificate;
import AbstractFactory.apple.model.packing.BrazilianPacking;
import AbstractFactory.apple.model.packing.Packing;


public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
