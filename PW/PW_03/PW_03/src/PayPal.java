public class PayPal implements PaymentSystem{
    private int count;
    private UniqueID id = new UniqueID(8, "payPal: ",count);

    private String email;

    public PayPal(String email) {
        this.email = email;
        count++;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal " + email + " на сумму " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат средств на PayPal " + email + " на сумму " + amount);
    }
}
