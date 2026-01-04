package org.example;

public class Student extends Person {

    private String major; // 전공

    public Student(String name, int age, String major) {
        // Person의 생성자를 호출
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    // introduce() 메소드를 재정의(오버라이드)
    @Override
    public void introduce() {
        System.out.println("안녕하세요, 저는 " + getName() + "이고, 나이는 " + getAge() +"살, 전공은 " + major + "입니다.");
    }
}
