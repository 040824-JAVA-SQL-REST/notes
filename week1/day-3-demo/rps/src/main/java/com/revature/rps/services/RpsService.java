package com.revature.rps.services;

//Service packages allow you to keep projects more organized and makes it easier to debug, and keep code clean.
public class RpsService {
    public void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
