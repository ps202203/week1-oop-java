package org.example;

import java.util.HashMap;
import java.util.Map;

public class UserMapDemo {
    public static void main(String[] args) {
        Map<String, User> userMap = new HashMap<>();

        User u1 = new User("철수", "chulsoo@example.com", 20);
        User u2 = new User("영희", "younghee@example.com", 22);

        // key = 이메일, value = User 객체
        userMap.put(u1.getEmail(), u1);
        userMap.put(u2.getEmail(), u2);

        // 1) 이메일로 빠르게 찾기
        String targetEmail ="chulsoo@example.com";
        User found = userMap.get(targetEmail);
        if (found != null) {
            System.out.println("찾은 유저: ");
            found.printInfo();
        } else{
            System.out.println("해당 이메일의 유저 없음");
        }

        // 2) 전체 유저 출력
        System.out.println("=== 전체 유저 ===");
        for(String email: userMap.keySet()) {
            User u = userMap.get(email);
            u.printInfo();
        }

    }
}
