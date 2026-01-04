package model;
public class Identity {
    String idType;
    String idNumber;

    
    public Identity(String idType, String idNumber) {
        this.idType = idType;
        this.idNumber = idNumber;
    }
    public String getIdType() {
        return idType;
    }
    public void setIdType(String idType) {
        this.idType = idType;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
