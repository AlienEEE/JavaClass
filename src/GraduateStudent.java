
public class GraduateStudent extends Student{
    private String studentLevel;
    private String thesisAdviser;
    public void oralExamination(){
        System.out.println("oralExamination");
    }
    public void thesisExamination(){
        System.out.println("thesisExamination");
    }
    public static void main(String[] args) {
    GraduateStudent san = new GraduateStudent();
    san.oralExamination();
    san.thesisExamination();
    san.enrollment();
    san.payment();
    san.addCourse();
    san.dropCourse();
    }
}
