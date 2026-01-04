package model;
public class CreditCard {
    private String number;
    private String expiryDate;


    
    public CreditCard(String number, String expiryDate) {
        this.number = number;
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
