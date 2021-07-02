package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int tickets=0;
        while(tickets!=-1){
            System.out.println("Please enter number of tickets:" );
            tickets=scanner.nextInt();
            System.out.println("How many round-trip tickets: ");
            int roundtrip= scanner.nextInt();
            Ticket ticket=new Ticket(tickets,roundtrip);
            ticket.print();
            break;
        }
    }
}
