package com.company;

class Student{
   private int id;
   private String name;
   private float percentage;

   public void setId(int i){
       id = i;
   }
   public void setName(String n){
       name = n;
   }
   public void setPercentage(float per){
       percentage = per;
   }
   public int getId(){
       return id;
   }
   public String getName(){
       return name;
   }
   public float getPercentage(){
       return percentage;
   }

   public Student(){
        id = 1;
        name = "John Anand";
        percentage = 82.3f;
   }
    public Student(int my_id, String my_name){
        id = my_id;
        name = my_name;
    }

}


public class Constructor {
    public static void main(String[] args) {
        Student john = new Student();
        Student ronit = new Student(2, "Ronit Sawant"); //Constructor overloading

        System.out.println(john.getId());
        System.out.println(john.getName());
        System.out.println(john.getPercentage());

        System.out.println(ronit.getId());
        System.out.println(ronit.getName());
        System.out.println(ronit.getPercentage());



    }
}
