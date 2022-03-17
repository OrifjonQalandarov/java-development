package com.OOP;

public class Student {

    private String type;
    private String name;
    private String sourname;
    private int age;
    private String adress;

    public Student(){ // empty constructor
        // JVM
    }

    public Student(String t, String n, int a,String s, String ad){
        type = t;
        name = n;
        age = a;
        sourname = s;
        adress = ad;
    }


    public void reference(String name, int a, String s, String ad, String t){

        System.out.println();
        System.out.println(" Type : " + t);
        System.out.println(" Sourname : " + s);
        System.out.println(" Name : " + name  );
        System.out.println(" Age : " + a );
        System.out.println(" Adress : " + ad);
        System.out.println();

    }
}
