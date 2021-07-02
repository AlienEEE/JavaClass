package chap5;

public class Address {

    private String regisAddress;
    private String currentAddress;

    public Address(String regisAddress) {
        this.regisAddress = regisAddress;
    }

    public String getRegisAddress() {
        return regisAddress;
    }

    public void setRegisAddress(String regisAddress) {
        this.regisAddress = regisAddress;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

}

class Department {

    private String depld;
    private String depName;

    public Department(String depld, String depName) {
        this.depld = depld;
        this.depName = depName;
    }

    public String getDepld() {
        return depld;
    }

    public void setDepld(String depld) {
        this.depld = depld;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

}
