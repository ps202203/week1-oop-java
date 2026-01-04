package org.example;

public class User {
    // 외부에서 바로 접근 못하도록 막아두고
    private String name;
    private String email;
    private int age;

    // 생성자
    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    // User의 정보 출력용 메소드
    public void printInfo(){
        System.out.println("이름: " + name + ", 이메일: " + email + ", 나이 " + age);
    }
}
