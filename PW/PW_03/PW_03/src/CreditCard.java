public class CreditCard implements PaymentSystem{
    private int count;
    private UniqueID id = new UniqueID(7, "creditCard: ",count);

    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        count++;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата с кредитной карты " + cardNumber + " на сумму " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств на кредитную карту " + cardNumber + " на сумму " + amount);
    }
}
