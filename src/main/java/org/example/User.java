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
    public void setName(String name) {  // 이름 변경 허용
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    // 이메일은 바꿔도 되고..
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    // 나이는 읽기 전용으로 두고 setter를 안 만들 수도 있음

    // User의 정보 출력용 메소드
    public void printInfo(){
        System.out.println("이름: " + name + ", 이메일: " + email + ", 나이 " + age);
    }
}
