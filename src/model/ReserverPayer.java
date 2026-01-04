public class ReserverPayer {

    private CreditCard creditCardDetails;
    private Identity id;

    public ReserverPayer(CreditCard creditCardDetails, Identity id) {
        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }

    public void create() {
        System.out.println("Payer record has been created in the system.");
    }

    public CreditCard getCreditCardDetails() {
        return creditCardDetails;
    }

    public void setCreditCardDetails(CreditCard creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    public Identity getId() {
        return id;
    }

    public void setId(Identity id) {
        this.id = id;
    }
}