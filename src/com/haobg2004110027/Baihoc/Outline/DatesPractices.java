package com.haobg2004110027.Baihoc.Outline;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DatesPractices {
     public static void main(String[] args) throws ParseException{
          Scanner input = new Scanner(System.in);
          
          SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
          SimpleDateFormat dateF2 = new SimpleDateFormat("dd/MMM/yyyy");
          Date date = null;
          Date date2 = null;

          String dateString = input.next();

          // System.out.print("Nhập ngày:");
          date = dateF.parse(dateString);

          System.out.println(date);

          String x = dateF.format(date + " " + dateF + " " + dateF2 + " " + date2);

          System.out.println(x);

          input.close();
     }
}
