package com.freeit.lesson15.intVsabstr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AirPark {

    private static Random rand = new Random();

    public static void main(String[] args) {
        List<AirFlyer> airs = new ArrayList<>();
        for (int i = 0; i < rand.nextInt(10) + 5; i++) {
            int typeNum = rand.nextInt(AirFlyerTypes.values().length);
            AirFlyer af = switch (typeNum) {
                case 0 -> new Boeing("737", 850);
                case 1 -> new Balloon(1024, 4220, rand.nextInt(50) + 50, rand.nextInt(400));
                case 2 -> new Dirigible(2200, 5500, rand.nextInt(100) + 200);
                default -> new Balloon(500, 2110, rand.nextInt(10) + 5, rand.nextInt(200));
            };
            airs.add(af);
        }

        for (int i = 0; i < airs.size(); i++) {
            airs.get(i).flyUp();
        }

        for (int i = 0; i < airs.size(); i++) {
            AirFlyer currentFlyer = airs.get(i);
            System.out.println("Current speed: " + currentFlyer.getCurrentSpeed());
            System.out.println("Current high: " + currentFlyer.getCurrentHigh(currentFlyer.getClass().toGenericString()));
            System.out.println("Current coordinates: " + currentFlyer.getGpsCoords());

            if(currentFlyer instanceof Balloon) {
                System.out.println("Ballon anti weight: " + ((Balloon) currentFlyer).getAntiWeight());
            }
        }

    }
}
