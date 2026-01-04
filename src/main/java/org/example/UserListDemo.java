package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserListDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User u1 = new User("기본유저", "basic@example.com",25);
        User u2 = new StudentUser("학생철수", "std@example.com",20, "대학교");
        User u3 = new EmployeeUser("직장영희", "emp@example.com", 28, "직장");

        users.add(u1);
        users.add(u2);
        users.add(u3);

        for(User u : users) {
            u.printInfo();  // 각 타입에 맞는 printInfo()가 알아서 호출됨
        }
    }
}
