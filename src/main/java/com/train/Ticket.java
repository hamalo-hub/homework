package com.train;

public class Ticket{
        int tickets;
        int roundtrip;
public Ticket(int tickets,int roundtrip){
        this.tickets=tickets;
        this.roundtrip=roundtrip;
}
    public void print(){
    int amount= (int)((tickets-roundtrip)*1000+(roundtrip*2000)*0.9);
        System.out.println("Total tickets: " + tickets + "\n" + "Round-trip: " + roundtrip + "\n" +
                "Total: " + amount );
    }
}
