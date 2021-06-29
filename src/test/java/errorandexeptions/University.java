package errorandexeptions;

public class University {
  private String university;
  private String faculty;
  private int group;
  Students student;

  public University(String university, String faculty, int group, Students student) {
    this.university = university;
    this.faculty = faculty;
    this.group = group;
    this.student = student;
  }

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public Students getStudent() {
    return student;
  }

  public void setStudent(Students student) {
    this.student = student;
  }
}
