package com.revature.rps.screens;

import java.util.Scanner;

import com.revature.rps.models.Player;
import com.revature.rps.services.RpsService;

public class RpsScreen {
    // Dependency Injection
    // a programming technique in which an object or function receives other objects or functions that it requires, as opposed to creating them internally
    private Player p1;
    private Player p2;
    private RpsService rpsService;
    private final Scanner scan;

    //Constructor class
    public RpsScreen(Player p1, Player p2, RpsService rpsService, Scanner scan) {
        this.p1 = p1;
        this.p2 = p2;
        this.rpsService = rpsService;
        this.scan = scan;
    }

    public void startGame() {
        String userInput = "";

        rpsService.clearConsole(); //clearConsole() helps to keep the terminal clean and easy to read
        System.out.println("##### Welcome " + p1.getName() + " to RPS! Let's play! #####");

        System.out.print("\nEnter: ");
        userInput = scan.nextLine();
    }
}
