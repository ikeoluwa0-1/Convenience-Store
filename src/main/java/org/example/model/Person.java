package org.example.model;

abstract class Person {
    private String name;
    private String mobileNumber;
    private int age;
    private String emailAddress;

    public Person(){
    }

    public Person(String name, String mobileNumber, int age, String emailAddress) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
