# Operativsystemer med systemprogrammering Assignment 2

## Overview
This is a simple multithreaded movie ticket booking system that demonstartes thread syncronizisation and volatile keyword in Java. The program simulates multiple users trying to book tickets at the same
time.

## How to use
Run Main.java

## How it works
- MovieTicketServer.java manages ticket bookings, keeping track of available tickets.
- MovieTicketClient.java represents users trying to book tickets.
- The Main.java file creates four user threads to book tickets concurrently.

## Observations
We tested two different versions of the booking system:

- Version 1: Using syncronizaton 
  - The final number of tickets is consistent and correct.

- Version 2: Using volatile keyword
  - We did not see much difference when using volatile compared to not using volatile. The results remained the same as version 1.

    
## Conclusions

- Synchronization (synchronized) is required to ensure thread safety when multiple threads modify a shared variable.

- Using volatile did not produce noticeable differences in the results. Therefore, we cannot determine whether volatile is correct or incorrect for this specific scenario.


