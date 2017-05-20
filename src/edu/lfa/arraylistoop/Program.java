/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.arraylistoop;

import edu.lfa.arraylistoop.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);         //scanner command

        List<User> userList = new ArrayList<>();        //Making new array list

        while (true) {
            System.out.println("***************************");
            System.out.println("Menu ");
            System.out.println("1.  Add User ");
            System.out.println("2.  Show all User ");
            System.out.println("3.  Search by ID");
            System.out.println("4.  Delete by ID");
            System.out.println("5.  Exit");
            System.out.println("***************************");

            System.out.println("Please choose from (1-5)");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    User u = new User();                //empty constructor

                    System.out.println("Enter ID");
                    u.setId(input.nextInt());           //using setter command from empty constructor
                    System.out.println("Enter the firstName ");
                    u.setFirstName(input.next());
                    System.out.println("Enter the lastName ");
                    u.setLastName(input.next());
                    System.out.println("Enter the email ");
                    u.setEmail(input.next());
                    System.out.println("Enter the status");
                    u.setStatus(input.nextBoolean());

                    userList.add(u);        // putting value of u to the database useList

                    break;
                case 2:
                    System.out.println("Showing all User !! ");
                    for (User usr : userList) {                       // checks each user from userList to usr
                        System.out.println(usr);
                    }

                    break;
                case 3:
                    System.out.println("Enter the ID to be Searched ");
                    int id = input.nextInt();
                    for (User usr : userList) {
                        if (id == usr.getId()) {
                            System.out.println(usr);
                        } else {
                            System.out.println("ID not Found !!! ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter the ID to be Deleted");
                    int id1 = input.nextInt();
                    for (User usr : userList) {
                        if (id1 == usr.getId()) {

                            userList.remove(usr);
                            System.out.println("Deleted ");
                        } else {
                            System.out.println("ID not Found!!");
                        }
                    }

                    break;
                case 5:
                    System.exit(0);
                    break;
            }
            System.out.println("********************************");
            System.out.println("Do you want to exit(yes/no) ");
            String check = input.next();
            if (check.equalsIgnoreCase("yes")) {
                System.exit(0);
            }

        }

    }
