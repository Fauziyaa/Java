package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }

}


public class AccessModifier {
    public static void main(String[] args) {

        MyEmployee emp1 = new MyEmployee();

//        emp1.id = 10;     //Can't set id and name due to private attribute
//        emp1.name = "Fauziya";
        emp1.setName("Fauziya Ansari");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());


    }
}
