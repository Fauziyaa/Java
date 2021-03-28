package com.company;

class FinallyDemo{
    public void finalDivide() {
        int a = 10, b = 10, c;
        while (true){
            try{
                c = a/b;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("Value of b is: "+b);
            }
            b--;
        }
    }
}


public class Finally {
    public static int divide(){
        try{
            int a = 50;
            int b = 0;
            int i = a / b;
            return i;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This will run...");
        }
        System.out.println("Without finally this will not run if program have no exception");

        return -1;
    }
    public static void main(String[] args) {
    int k = divide();
        System.out.println(k);
    FinallyDemo fd = new FinallyDemo();
    fd.finalDivide();
    }
}
