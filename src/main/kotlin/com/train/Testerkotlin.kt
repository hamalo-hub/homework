package com.train

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    var tickets= 0
    while (tickets != -1) {
        println("Please enter number of tickets:")
        tickets = scanner.nextInt()
        if (tickets == -1) {
            break
        }
        println("How many round-trip tickets: ")
        var roundtrip=scanner.nextInt()
        val ticket= Tickets(tickets,roundtrip)
        ticket.print()
        break
    }
}
class Tickets(var tickets:Int,var roundtrip:Int){
   fun amount() = (tickets-roundtrip)*1000+(roundtrip*2000)*0.9
    fun print(){
        println("Total tickets: $tickets\n" + "Round-trip: $roundtrip\n" +
                "Total:  ${amount()}" )
    }
}

