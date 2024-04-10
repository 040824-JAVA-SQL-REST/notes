package com.revature.rps.services;

public class RpsService {
    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
