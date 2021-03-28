/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.model;

/**
 *
 * @author Kamran
 */
public class Student {

    private int id;
    private String name;
    private String surname;
    private int age;
    private double point;
    private String city;
    private String gender;
    private String favorite;

    public Student() {
    }

    public Student(int id, String name, String surname, int age, double point, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.point = point;
        this.city = city;
    }

    public Student(int id, String name, String surname, int age, double point, String city, String gender, String favorite) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.point = point;
        this.city = city;
        this.gender = gender;
        this.favorite = favorite;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", point=" + point + ", city=" + city + ", gender=" + gender + ", favorite=" + favorite + '}';
    }

  

}
