package org.example;

public class StudentUser extends User {
    private String school;

    public StudentUser(String name, String email, int age, String school) {
        super(name, email, age);    // User 생성자 호출
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void printInfo(){
        System.out.println(
                "[학생] 이름: " + getName() +
                ", 이메일: " + getEmail() +
                ", 나이: " + getAge() +
                ", 학교: " + school
        );
    }

}
