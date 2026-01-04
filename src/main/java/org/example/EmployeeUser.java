package org.example;

public class EmployeeUser extends User {
    private String company;

    public EmployeeUser(String name, String email, int age, String company){
        super(name, email, age);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public void printInfo(){
        System.out.println(
                "[직장인] 이름: " + getName() +
                        ", 이메일: " + getEmail() +
                        ", 나이: " + getAge() +
                        ", 회사: " + company
        );
    }
}
