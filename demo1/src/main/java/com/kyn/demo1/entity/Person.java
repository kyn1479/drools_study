package com.kyn.demo1.entity;


/**
 * @author Kangyanan
 * @Description:
 * @date 2021/6/9
 */
public class Person{
    private String name;
    private Integer age;
    private String interest;

    public Person(String name, Integer age, String interest) {
        this.name = name;
        this.age = age;
        this.interest = interest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", interest='" + interest + '\'' +
                '}';
    }
}
