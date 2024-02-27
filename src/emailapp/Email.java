package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  int mailboxCapacity;
  private String alternateEmail;
  private int defaultPasswordLength = 10;
  private String companySuffix = "belove.com";

  // Contructor to receive the first name and last name

  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Email created: " + this.firstName + " " + this.lastName);
    //Call a method asking for the department
    this.department = setDepartment();
    System.out.println("The department is: " + this.department);
    //Call a method that return a random password
    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is: "+ this.password);
    //Combine the elements to generate email
    email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
    System.out.println("Your email is: "+this.email);
  }


  //Ask for the department
  private String setDepartment() {
    System.out.println("Departments Code: \n1 for Sale\n2 for Development\n3 for Accounting\n4 for none\nEnter the department code: ");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    if (depChoice == 1) {
      return "sales";
    } else if (depChoice == 2) {
      return "dev";
    } else if (depChoice == 3) {
      return "Acounting";
    } else {
      return "";
    }
  }
    //Show infomation
    public void showInfo(){
      System.out.println("Your infomation: "+ firstName +" "+ lastName+"\n" +email+ "-"+password);
    }
    //Generate random password
  private String randomPassword(int length){
      String passwordSet = "ABCDEFGHIKLMOPQZWY!@#$%^&*";
      char[] password = new char[length];
      for(int i =0;i<length;i++){
        int rand = (int)(Math.random()*passwordSet.length());
        password[i] = passwordSet.charAt(rand);
      }
    return new String(password);
    }

    //Set the mailbox capacity

  public void setMailboxCapacity(int mailboxCapacity) {
    this.mailboxCapacity = mailboxCapacity;
  }

  //Set the alternate email

  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = alternateEmail;
  }

  //Change the password


  public void setPassword(String password) {
    this.password = password;
  }
}

