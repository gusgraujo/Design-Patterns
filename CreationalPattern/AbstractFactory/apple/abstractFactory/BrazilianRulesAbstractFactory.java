package CreationalPattern.AbstractFactory.apple.abstractFactory;

import CreationalPattern.AbstractFactory.apple.model.certificate.BrazilianCertificate;
import CreationalPattern.AbstractFactory.apple.model.certificate.Certificate;
import CreationalPattern.AbstractFactory.apple.model.packing.BrazilianPacking;
import CreationalPattern.AbstractFactory.apple.model.packing.Packing;


public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
