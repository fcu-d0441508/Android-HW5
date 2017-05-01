package com.example.user.nbaplayoffs;

/**
 * Created by User on 2017/5/1.
 */

public class NBAGame {

    int hostLogo;
    String hostName;
    String hostScore;
    int guestLogo;
    String guestName;
    String guestScore;

    public NBAGame(int hostLogo, String hostName, String hostScore,
                         int guestLogo, String guestName, String guestScore) {

        this.hostLogo = hostLogo;
        this.hostName = hostName;
        this.hostScore = hostScore;
        this.guestLogo = guestLogo;
        this.guestName = guestName;
        this.guestScore = guestScore;
    }
}
