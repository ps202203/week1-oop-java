package org.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("홍길동", 30);
        p.introduce();

        Person p2 = new Student("영희", 21, "경영학");
        p2.introduce(); // 실제로는 Student의 introduce()가 실행됨.

        Student s = new Student("철수", 20, "컴퓨터공학");
        s.introduce();
    }
}
