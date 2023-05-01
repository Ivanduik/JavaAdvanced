package hw5.t3;

import java.math.BigInteger;

public class MyClass {
    public  String myName;
    protected String myEmail;
  private String myPhone;
    public MyClass(String myName) {
        this.myName = myName;
    }
    public MyClass(String myName, String myEmail) {
        this.myName = myName;
        this.myEmail = myEmail;
    }
    public MyClass(String myName, String myEmail, String myPhone) {
        this.myName = myName;
        this.myEmail = myEmail;
        this.myPhone = myPhone;
    }
    public String getMyName() {
        return myName;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public void setMyEmail(String myEmail) {
        this.myEmail = myEmail;
    }

    public String getMyPhone() {
        return myPhone;
    }

    public void setMyPhone(String myPhone) {
        this.myPhone = myPhone;
    }
    private void setMyPhone1(String myPhone) {
        this.myPhone = myPhone;
    }
}
