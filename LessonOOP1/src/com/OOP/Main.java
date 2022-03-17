package com.OOP;

public class Main {
    public static void main(String[] args) {

     Student student1 = new Student( "Type", "name",10,"sourname","adres"  );
     student1.reference("Asadbek",16,"Abdurasulov", "xorazm","Student");

     Student student2 = new Student("Type","name",10,"sourname","adres");
     student2.reference("Abror",16,"Abdullayev", "xorazm","Student");

     Student student3 = new Student("Type","name",10,"sourname","adres");
     student3.reference("Azamat",16,"Fayzullayev", "xorazm","Student");

     Student student4 = new Student("Type","name",10,"sourname","adres");
     student4.reference("Orifjon",16,"Qalandarov", "xorazm","Student");

     Teacher teacher = new Teacher("Type","name",10,"sourname","adres", "Math" );
     teacher.reference("Orifjon",16,"Qalandarov", "xorazm","Math","Teacher");
    }
}
