package chap5;

public class Parent {
    private final String parentName;
    private final String address;
    private final String telephonNo;

    public Parent(String parentName, String address, String telephonNo) {
        this.parentName = parentName;
        this.address = address;
        this.telephonNo = telephonNo;
    }

    public String getParentName() {
        return parentName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephonNo() {
        return telephonNo;
    }
    
    
}
