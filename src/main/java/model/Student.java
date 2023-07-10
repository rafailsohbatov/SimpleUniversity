package model;

public class Student extends AbstractClass {
    private String surname;
    private Integer age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void add() throws Exception {
        System.out.println("Student Information\nStudent Id - " + getId() + "\nStudent Name - " + getName() + "\nStudent Surname - "
                + surname + "\nStudent Age - " + age);
    }

    @Override
    public void update() throws Exception {

    }

    @Override
    public void delete() throws Exception {

    }

    @Override
    public void search() throws Exception {

    }
}
