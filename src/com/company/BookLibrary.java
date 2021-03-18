package com.company;
import java.util.Scanner;

class Library{
    String [] books = new String[10];
    int no_of_books = 0;

    public void addBooks(){  //Method 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Add Books");
        for (int i = 0; i<books.length; i++){
                books[i] = sc.nextLine();
        }
    }
    public void addBooks(String bookName){  //Method 2
       this.books[no_of_books] = bookName;
       no_of_books++;
    }
    public void showBooks(){
        System.out.println("Books in Library: ");
        for (int i = 0; i< books.length; i++){
            if (books[i] == null){
                continue;
            }
                System.out.println(books[i]);
        }
    }

    public void issueBook(String bookName){
        int flag = 0;
        for (int i = 0; i< books.length; i++){
            if (this.books[i].equals(bookName)){
                System.out.println(bookName+ " has been issued");
                this.books[i] = null;
                flag = 1;
                break;
            }
        }
    if (flag == 0){
        System.out.println("Sorry book is not available");
    }
    }
    public void returnBook(String book){
        addBooks(book);
    }
}


public class BookLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Library centralLibrary = new Library();
        centralLibrary.addBooks("C");
        centralLibrary.addBooks("Java");
        centralLibrary.addBooks("C++");
        centralLibrary.addBooks("Python");
        centralLibrary.addBooks("Django");
        centralLibrary.showBooks();
        System.out.println("Enter a book name to be issue");
        String name = sc.nextLine();
        centralLibrary.issueBook(name);
        centralLibrary.showBooks();
        centralLibrary.returnBook("Flutter");
        centralLibrary.showBooks();


    }
}
