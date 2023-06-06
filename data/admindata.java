package data;

import java.util.ArrayList;

public class admindata {
    ArrayList<String> admin_name=new ArrayList<>();
    ArrayList<String> admin_password=new ArrayList<>();
    public ArrayList<String>  adminname(){
        this.admin_name.add("deepak");
        return this.admin_name;
    } 
    public ArrayList<String> adminpassword(){
        this.admin_password.add("12");
        this.admin_password.add("123");
        return this.admin_password;
    }
}
