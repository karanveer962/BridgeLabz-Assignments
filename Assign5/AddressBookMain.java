package Assign5;

import java.util.Scanner;


class Person{
   private String f_name,l_name,address,city,state,zip,phnum,email;

   public Person(String f_name,String l_name,String address,String city,String state,String zip,String phnum,String email){
     this.f_name=f_name;
     this.l_name=l_name;
     this.address=address;
     this.city=city;
     this.state=state;
     this.zip=zip;
     this.phnum=phnum;
     this.email=email;
   }
}
public class AddressBookMain {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Address Book program  in AddressBookMain class on Master Branch");
        
    }
}
