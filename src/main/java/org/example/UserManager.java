package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        while(true){
            printMenu();
            int menu = scanner.nextInt();
            scanner.nextLine(); // 개행 제거 - nextInㅋㅌt()는 엔터를 남겨둠.

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu == 1) {
                System.out.println("유저 타입을 선택하세요: ");
                System.out.println("1. 일반 유저");
                System.out.println("2. 학생 유저");
                System.out.println("3. 직장인 유저");
                System.out.print("타입: ");

                int type = scanner.nextInt();
                scanner.nextLine(); // 개행 제거

                System.out.print("이름을 입력하세요: ");
                String name = scanner.nextLine();

                System.out.print("이메일을 입력하세요: ");
                String email = scanner.nextLine();

                System.out.print("나이를 입력하세요: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // 개행 제거

                User newUser;

                if(type == 1){
                    newUser = new User(name, email, age);
                } else if (type == 2) {
                    System.out.print("학교 이름을 입력하세요: ");
                    String school = scanner.nextLine();
                    newUser = new StudentUser(name, email, age, school);
                } else if (type == 3) {
                    System.out.print("회사 이름을 입력하세요: ");
                    String company = scanner.nextLine();
                    newUser = new EmployeeUser(name, email, age, company);
                } else{
                    System.out.println("올바르지 않은 타입입니다. 기본 유저로 생성합니다.");
                        newUser = new User(name, email, age);
                }

                users.add(newUser);
                System.out.println("유저가 추가되었습니다.");
            } else if (menu == 2) {
                if(users.isEmpty()){
                    System.out.println("등록된 유저가 없습¡니다.");
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
            } else if (menu == 4) {
                // TODO 이메일로 유저 삭제 : 입력받은 이메일과 같은 유저를 찾아서 리스트에서 제거
                System.out.println("삭제할 유저의 이메일을 입력하세요: ");
                String targetEmail = scanner.nextLine();

                boolean removed = false;

                for(int i = 0; i < users.size(); i++){
                    User u = users.get(i);
                    if(u.getEmail().equals(targetEmail)){
                        users.remove(i);    // 해당 인덱스의 유저 제거
                        removed = true;
                        System.out.println("이메일 " + targetEmail + " 유저가 삭제되었습니다.");
                        break;              // 하나만 지우고 반복 종료
                    }
                }
            } else if (menu == 5) {
                // TODO 나이 기준 필터링 "나이가 20 이상인 유저만 보기" 같은 필터
                System.out.println("최소 나이를 입력하세요");
                int minAge = scanner.nextInt();
                scanner.nextLine(); // 개행 제거

                boolean found = false;

                System.out.println("== 나이 " + minAge +" 이상인 유저 목록 ===");
                for(User u : users){
                    if(u.getAge() >= minAge){
                        u.printInfo();
                        found = true;
                    }
                }

                if(!found){
                    System.out.println("조건을 만족하는 유저가 없습니다.");
                }

            } else {
                System.out.println("잘못된 메뉴입니다.");
            }

            System.out.println();
        }

        scanner.close();
    }
    private static void printMenu(){
        System.out.println("==== 유저 관리 프로그램 ====");
        System.out.println("1. 유저 추가");
        System.out.println("2. 전체 유저 목록 보기");
        System.out.println("3. 이름으로 유저 검색");
        System.out.println("4. 이메일로 유저 삭제");
        System.out.println("5. 나이 기준으로 유저 보기");
        System.out.println("0. 종료");
        System.out.print("메뉴를 선택하세요: ");
    }
    private static void addUser(Scanner scanner, List<User> users){

    }
}
