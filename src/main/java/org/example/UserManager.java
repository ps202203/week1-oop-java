package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        while(true){
            System.out.println("==== 유저 관리 프로그램 ====");
            System.out.println("1. 유저 추가");
            System.out.println("2. 전체 유저 목록 보기");
            System.out.println("3. 이름으로 유저 검색");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 제거 - nextInt()는 엔터를 남겨둠.

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu == 1) {
                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("이메일을 입력하세요: ");
                String email = scanner.nextLine();

                System.out.print("나이를 입력하세요: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // 개행 제거

                User user = new User(name, email, age);
                users.add(user);

                System.out.println("유저가 추가되었습니다.");
            } else if (menu == 2) {
                if(users.isEmpty()){
                    System.out.println("등록된 유저가 없습니다.");
                } else{
                    System.out.println("=== 전체 유저 목록 ===");
                    for(int i = 0; i < users.size(); i++){
                        User u = users.get(i);
                        System.out.println((i + 1) + ". ");
                        u.printInfo();
                    }
                }
            } else if (menu == 3) {
                System.out.println("검색할 이름을 입력하세요.");
                String keyword = scanner.nextLine();

                boolean found = false;
                for(User u : users){
                    if(u.getName().contains(keyword)){
                        u.printInfo();
                        found = true;
                    }
                }

                if(!found){
                    System.out.println("해당 이름을 가진 유저를 찾을 수 없습니다.");
                }
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
