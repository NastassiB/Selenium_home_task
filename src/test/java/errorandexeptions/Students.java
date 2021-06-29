package errorandexeptions;

public class Students {

  String subject1;
  String subject2;
  String subject3;
  int marksSubject1;
  int marksSubject2;
  int marksSubject3;

  public Students(String subject1, int marksSubject1) {
    this.subject1 = subject1;
    this.marksSubject1 = marksSubject1;
  }

  public Students(String subject1, String subject2, int marksSubject1, int marksSubject2) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.marksSubject1 = marksSubject1;
    this.marksSubject2 = marksSubject2;
  }

  public Students(String subject1, String subject2, String subject3, int marksSubject1, int marksSubject2, int marksSubject3) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
    this.marksSubject1 = marksSubject1;
    this.marksSubject2 = marksSubject2;
    this.marksSubject3 = marksSubject3;
  }

  public String getSubject1() {
    return subject1;
  }

  public void setSubject1(String subject1) {
    this.subject1 = subject1;
  }

  public String getSubject2() {
    return subject2;
  }

  public void setSubject2(String subject2) {
    this.subject2 = subject2;
  }

  public String getSubject3() {
    return subject3;
  }

  public void setSubject3(String subject3) {
    this.subject3 = subject3;
  }

  public int getMarksSubject1() {
    return marksSubject1;
  }

  public void setMarksSubject1(int marksSubject1) {
    this.marksSubject1 = marksSubject1;
  }

  public int getMarksSubject2() {
    return marksSubject2;
  }

  public void setMarksSubject2(int marksSubject2) {
    this.marksSubject2 = marksSubject2;
  }

  public int getMarksSubject3() {
    return marksSubject3;
  }

  public void setMarksSubject3(int marksSubject3) {
    this.marksSubject3 = marksSubject3;
  }
}
