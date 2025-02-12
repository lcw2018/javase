package com.lcw.demo05.Collections;

public class Person implements Comparable<Person> {
    //被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    private String name;
    private Integer age;

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

    public Person() {

    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age; //按照年龄升序
    }
}
