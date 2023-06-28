package StructuralPattern.Facade.callCenter;

import StructuralPattern.Facade.callCenter.facade.CallCenterFacade;
import StructuralPattern.Facade.callCenter.model.Card;
import StructuralPattern.Facade.callCenter.model.Register;
import StructuralPattern.Facade.callCenter.services.*;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		CallCenterFacade facade = new CallCenterFacade();

		Card card = facade.getCardByUser(123456L);
		System.out.println(card);

		facade.getSumary(card);

		facade.getPaymentInfoByCard(card);

		facade.cancelLastRegister(card);

		Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}

