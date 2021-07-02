
public class Student {
  protected String studentId;
  protected String studentName;
  protected String faculty;
  protected String major;
  
  public void enrollment(){
      System.out.println("enrollment");
  }
  public void payment(){
      System.out.println("payment");
  }
  public void addCourse(){
      System.out.println("addcourse");
  }
  public void dropCourse(){
      System.out.println("dropcourse");
  }
  public static void main(String[] args) {
  Student lookyee = new Student();
  lookyee.enrollment();
  lookyee.payment();
  lookyee.addCourse();
  lookyee.dropCourse();
  }
}//end
