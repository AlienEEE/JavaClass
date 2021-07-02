package chap5;

public class Student {
    private String sudentId;
    private String sudentName;
    private Counsellor counsellor;
    private Parent perent;

    public Student(String sudentId, String sudentName) {
        this.sudentId = sudentId;
        this.sudentName = sudentName;
    }

    public String getSudentId() {
        return sudentId;
    }

    public void setSudentId(String sudentId) {
        this.sudentId = sudentId;
    }

    public String getSudentName() {
        return sudentName;
    }

    public void setSudentName(String sudentName) {
        this.sudentName = sudentName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getPerent() {
        return perent;
    }

    public void setPerent(Parent perent) {
        this.perent = perent;
    }
    
    public void printDetails(){
        System.out.println("StudentId : "+sudentId);
        System.out.println("StudentName : "+sudentName);
        System.out.println("Counsellor id : "+getCounsellor().getCounsellorId());
        System.out.println("Counsellor name : "+getCounsellor().getCounsellorName());
        System.out.println("Telephone : "+getCounsellor().getTelephoneNo());
        System.out.println("Parent name : "+getPerent().getParentName());
        System.out.println("Address : "+getPerent().getAddress());
        System.out.println("Telephone : "+getPerent().getTelephonNo());
    }
    
    
}
