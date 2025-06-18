package com.xworkz.skanda.dto;

import java.io.Serializable;

public class FormDTO implements Serializable {
    private String name;
    private int age;
    private String father;
    private String mother;
    private String adress;

    public FormDTO(){
        System.out.println("No-args Constructor of DTO");
    }

    public FormDTO(String name, int age, String father, String adress, String mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.adress = adress;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "FormDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
