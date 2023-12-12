package services;

public interface OnlinePayment {
    public double installmentCalculator(double contractValue, int months);
}
