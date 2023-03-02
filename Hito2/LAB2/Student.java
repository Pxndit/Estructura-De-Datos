package Ejercicio;

public class Student {
    private String fullname;
    private String lastname;
    private int age;

    public Student(String fullname, String lastname, int age){
        this.fullname= fullname;
        this.lastname= lastname;
        this.age= age;
    }
    public String getFullName(){
        return this .fullname;
    }
    public void setfullname(String fullname){
        this.fullname=fullname;
    }
    public String getLastname(){
        return this .lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public int getage(){
        return this .age;
    }
    public void setage(int age){
        this.age=age;
    }
}
