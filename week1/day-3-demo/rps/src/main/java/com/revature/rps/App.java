package com.revature.rps;

import java.util.Scanner;

import com.revature.rps.models.Player;
import com.revature.rps.screens.RpsScreen;
import com.revature.rps.services.RpsService;

public class App {
    public static void main(String[] args) {

        // Intialize and instantiate dependencies
        Scanner scan = new Scanner(System.in);

        // Services
        RpsService rpsService = new RpsService();
        rpsService.clearConsole();

        // Players
        Player p1 = new Player(
                new App().getPlayerName(scan),
                false,
                0,
                0,
                0);
        Player p2 = new Player("CPU", true, 0, 0, 0);

        new RpsScreen(p1, p2, rpsService, scan).startGame();
    }

    //A helper class for getting player names
    private String getPlayerName(Scanner scan) {
        System.out.print("Please enter your player name: ");
        String pName = "";
        pName = scan.nextLine();
        return pName;
    }
}
