package services;

import services.OnlinePayment;

public class Paypal implements OnlinePayment {
    private double installmentTax;
    private double paymentTax;

    public Paypal() {
    }

    public double getInstallmentTax() {
        return installmentTax;
    }

    public void setInstallmentTax(double installmentTax) {
        this.installmentTax = installmentTax;
    }

    public double getPaymentTax() {
        return paymentTax;
    }

    public void setPaymentTax(double paymentTax) {
        this.paymentTax = paymentTax;
    }
    @Override
    public double installmentCalculator(double contractValue, int month) {
        double jr = (contractValue + (contractValue * 0.01)*(month));
        return (jr + ( jr * 0.02));
    }
}
