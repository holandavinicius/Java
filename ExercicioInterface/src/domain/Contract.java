package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int contractNumber;
    private LocalDate contractDate;
    private double contractValue;
    private List<Installment> installments = new ArrayList<>();
    public Contract(int contractNumber, LocalDate contractDate, double contractValue) {
        this.contractDate = contractDate;
        this.contractNumber = contractNumber;
        this.contractValue = contractValue;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
