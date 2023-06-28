package StructuralPattern.Facade.callCenter.facade;

import StructuralPattern.Facade.callCenter.model.Card;
import StructuralPattern.Facade.callCenter.model.Register;
import StructuralPattern.Facade.callCenter.services.*;

import java.util.List;

public class CallCenterFacade {

    private CardService cardService;
    private PaymentService paymentService;
    private RegisterService registerService;
    private ReportService reportService;
    private SecurityService securityService;

    public CallCenterFacade() {
        cardService = new CardService();
        registerService = new RegisterService();
        reportService = new ReportService(registerService);
        paymentService = new PaymentService(registerService);
        securityService = new SecurityService(cardService,registerService);
    }

    public Card getCardByUser(Long l) {
        return cardService.getCardByUser(l);
    }

    public void getSumary(Card card) {
        reportService.getSumary(card);
    }

    public void getPaymentInfoByCard(Card card) {
        paymentService.getPaymentInfoByCard(card);
    }

    public void cancelLastRegister(Card card) {
        List<Register> registers = registerService.getRegistersByCard(card);
        registerService.removeByIndex(card, registers.size() - 1);
        List<Register> pendingRegisters = securityService.blockCard(card);
        Card newCard = cardService.createNewCard(123456L, 33445566L);
        registerService.addCardRegisters(newCard, pendingRegisters);
        reportService.getSumary(newCard);
    }

}
