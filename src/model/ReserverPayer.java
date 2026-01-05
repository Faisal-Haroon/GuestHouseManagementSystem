package model;

public class ReserverPayer extends Guest {
    private CreditCard creditCardDetails;
    private Identity id;

    public ReserverPayer(Name name, Address address, CreditCard card, Identity id) {

        super(name, address);
        this.creditCardDetails = card;
        this.id = id;
    }

    @Override
    public void create() {
        // other logic bad me phr kabi..
        System.out.println("ReserverPayer created (Inherited from Guest)");
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