package com.company;

class Employe{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname){
        name = newname;
    }
}

class CellPhone{

    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukesh...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class ClassPractice {
    public static void main(String[] args) {
        //Practice Question 1

//        Employe emp1 = new Employe();
//
//        emp1.name = "Fauziya";
//        emp1.salary = 10000;
//        System.out.println(emp1.getName());
//        System.out.println(emp1.getSalary());
//        emp1.setName("Ansari");
//        System.out.println(emp1.getName());

        //Practice Question 2
//        CellPhone phone = new CellPhone();
//        phone.ring();
//        phone.vibrate();
//        phone.callFriend();

        //Practice Question 3
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //Practice Question 4
        Tommy player = new Tommy();
        player.hit();
        player.run();
        player.fire();

    }
}
