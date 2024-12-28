package Dec_2024.ex_exceptionalHandling26122024;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) {
        if(!bankName.currency.equalsIgnoreCase("INR"))
            try {
                throw new Exception("Currency does not match");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}
