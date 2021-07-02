package chap5;

public class CallStudent {
    public static void main(String[] args) {
        Student std = new Student("624234013","Suthawee Solaeh");
        std.setCounsellor(new Counsellor("185","Nalinee Inthamano","0889551234"));
        std.setPerent(new Parent("Somkiat Solaeh","72 Soi.4 Sungaikolok Narathiwat","0831854980"));
        std.printDetails();
    }
}
