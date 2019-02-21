package com.revature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // if(userRequest.equals("login")){
        //     try(
        //         InputStreamReader isr = new InputStreamReader(System.in);
        //         BufferedReader br = new BufferedReader(isr)
        //     ) {
        //         System.out.println("Success");
        //         String loginInput = br.readLine();

        //     } catch (IOException exception) {
        //         exception.printStackTrace();
        //     }
        // }else if(userRequest.equals("new user")){
        //     try(
        //         InputStreamReader isr2 = new InputStreamReader(System.in);
        //         BufferedReader br2 = new BufferedReader(isr2)
        //     ) {
        //         String newUser = br2.readLine();
        //         try (PrintWriter out = new PrintWriter("users.txt")) {
        //             out.println(newUser);
        //         }
        //     } catch (IOException exception) {
        //         exception.printStackTrace();
        //     }
        // }
    }
}
