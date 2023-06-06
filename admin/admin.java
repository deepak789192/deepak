package admin;

import java.util.ArrayList;
import java.util.Scanner;

import data.admindata;
public class admin {
    public int attempt=1;
    public String adminname;
    public String adminpassword;
    Scanner sc=new Scanner(System.in);
    ArrayList<String> admin_name=new ArrayList<>();
    ArrayList<String> admin_passsword=new ArrayList<>();
    boolean f=false;
    admindata a=new admindata();
    public boolean admins() {
    admin_passsword=a.adminpassword();
    int i=adminname1();
    if(i>-1){
  f=passwords(f,i);
  return f;
    }
    else{
        f=false;
        return f;
    }
    }
    public int adminname1(){
        admin_name=a.adminname();
        System.out.println("enter the admin name:");
        adminname=sc.next();
        int i=-1;
    if(admin_name.contains(adminname)){
         i=admin_name.indexOf(adminname);
        f=true;
        return i;
    }
    else{
        System.out.println("ADMIN NAME is wrong");
        f=false;
        return i;
    }
}
public boolean passwords(boolean f, int i){
    if(i>=0)
        System.out.println("enter the password:");
        adminpassword=sc.next();
        if(admin_passsword.get(i).equals(adminpassword)){
            System.out.println("you are sussefully login");
            f=true;
            return f;
        }
        else{
            System.out.println("password is wrong");
            attempt=attempt+1;
            f=false;
            if(attempt<4){
                passwords(f, i);
            }
            if(attempt==4){
        try {
            Thread.sleep(2000);
            System.out.println("you attempt 4 times so try again with run again");
            attempt=attempt+1;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
            return f;
        }   
    }
}
