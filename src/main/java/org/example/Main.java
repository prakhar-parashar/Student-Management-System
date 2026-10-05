package org.example;

import org.example.Entities.Faculty;
import org.example.Entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int choice;
        Scanner scan = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        List<Faculty> facultyList = new ArrayList<>();
        while (true)
        {
            System.out.print("Enter 1 to sign-up\nEnter 2 to login\nEnter 3 to change password\nEnter 0 to exit:\t");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    signUp();
                    break;
                case 2:
                    choice = login();
                    if(choice == 0)
                    {

                    }
                    else if(choice == 1)
                        System.out.println("Login Failed! Username not found.");
                    else
                        System.out.println("Login Failed! Wrong password.");
                    break;
                case 3:
                    forgetPassword();
                    break;
                case 0:
                    return;
            }
        }
    }
}
