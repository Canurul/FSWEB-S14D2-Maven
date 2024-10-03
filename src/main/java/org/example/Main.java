package org.example;
import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("yatak odası",
                new Wall("North"),
                new Wall("south"),
                new Wall("east"),
                new Wall("west"),
                new Ceiling(10, PaintColor.GREEN),
                new Bed("yumuşak", 3, 4, 2, 1),
                new Lamp(LampType.LAVA, true, 8),
                new Wardrobe(8, 8, 10),
                new Carpet(4, 6, PaintColor.RED));


        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Wall 2 Direction: " + bedroom.getWall2().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Style: " + bedroom.getBed().toString());
        System.out.println("Lamp Battery Status: " + bedroom.getLamp().isBattery());
        System.out.println("Lamp Global Rating: " + bedroom.getLamp().getGlobalRating());
        System.out.println("Wardrobe Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();

    }
}