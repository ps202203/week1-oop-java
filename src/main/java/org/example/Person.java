package org.example;

public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 자기소개 메소드
    public void introduce(){
        System.out.println("안녕하세요, 저는 " + name + "이고, 나이는 " + age +"살 입니다.");
    }
}
