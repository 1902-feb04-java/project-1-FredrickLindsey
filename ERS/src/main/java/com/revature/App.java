package com.revature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        String userRequest = "";
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr)
        ) {
            userRequest = br.readLine();
            Scanner scan = new Scanner(userRequest);
            scan.useDelimiter(", ");
            String id = scan.next();
            String money = scan.next();
            String manager = scan.next();
            System.out.println(id+" "+money+" "+manager);
            String username = br.readLine();
            String password = br.readLine();
            StringBuilder passwordHidden = new StringBuilder();
            for(int i = 0; i<password.length() ; i++){
                passworHidden.append('*');
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
