package services;

import domain.Contract;
import domain.Installment;

import java.time.LocalDate;

public class ContractService{

    private OnlinePayment onlinePayment;
    public ContractService(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public OnlinePayment getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(OnlinePayment onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    public void processContract(Contract contract, int months){
        for (int i=1; i <= months; i++){
            LocalDate dueDate = contract.getContractDate().plusMonths(i);
            double installment = onlinePayment.installmentCalculator(contract.getContractValue(), i);
            contract.getInstallments().add(new Installment(dueDate, installment));
        }
    }
}