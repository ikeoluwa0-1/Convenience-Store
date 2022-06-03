package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Applicant {
   public static HashMap<String, String> applicantFile = new HashMap<>();
//   public ArrayList<person> person = new person();
    private String name;
    private QualifiedGrade qualification;
    private int age;
    private String entryRole;

    public int getAge() {
    return age;
 }

    public void setAge(int age) {
     this.age = age;
 }


    public Applicant() {
    }

    public Applicant(QualifiedGrade qualification, String entryRole) {
        this.qualification = qualification;
        this.entryRole = entryRole;
    }

    public QualifiedGrade getQualification() {
        return qualification;
    }

    public void setQualification(QualifiedGrade qualification) {
        this.qualification = qualification;
    }

    public String getEntryRole() {
        return entryRole;
    }

    public void setEntryRole(String entryRole) {
        this.entryRole = entryRole;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
