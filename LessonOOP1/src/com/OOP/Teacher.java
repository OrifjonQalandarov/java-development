package com.OOP;

public class Teacher {

    private String name;
    private String sourname;
    private int age;
    private String type;
    private String adress;
    private String job;

    public Teacher(String t,String n, int a,String s, String ad,  String j ){
        type = t;
        name = n;
        age = a;
        sourname = s;
        adress = ad;
        job = j;
    }

    public void reference(String name, int a, String s, String ad, String j, String t){

        System.out.println();
        System.out.println(" Type : " + t);
        System.out.println(" Sourname : " + s);
        System.out.println(" Name : " + name  );
        System.out.println(" Age : " + a );
        System.out.println(" Adress : " + ad);
        System.out.println(" Job : " + j);
        System.out.println();

    }



}
