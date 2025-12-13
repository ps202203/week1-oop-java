package org.example;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("철수", "chulsoo@example.com", 20);
        User user2 = new User("영희", "younghee@exmapl.com", 22);

        user1.printInfo();
        user2.printInfo();

        user1.setName("김철수");
        System.out.println("이름 변경 후: " + user1.getName());
    }
}
