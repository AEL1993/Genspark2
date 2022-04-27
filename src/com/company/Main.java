package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static Random rand = new Random();

    public static void main(String[] args) {
        Room[] rooms = new Room[]{randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom(), randomRoom()};
        Arrays.sort(rooms);
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
        System.out.println("Classrooms:");
        for (Room room : onlyClassrooms(rooms)) {
            System.out.println(room.toString());
        }
    }

    public static Room[] onlyClassrooms(Room[] rooms){
        Room[] classrooms = new Room[rooms.length];
        int counter = 0;
        for (Room room : rooms) {
            if(room instanceof Classroom) {
                {
                    classrooms[counter] = room;
                    counter ++;
                }
            }
        }
        return Arrays.copyOfRange(classrooms, 0, counter);
    }

    public static Room randomRoom() {
        return rand.nextDouble() > 0.5 ? new Room(((int) (rand.nextDouble() * 20)) / 2.0, ((int) (rand.nextDouble() * 20)) / 2.0, rand.nextInt(10)) : new Classroom(((int) (rand.nextDouble() * 20)) / 2.0, ((int) (rand.nextDouble() * 20)) / 2.0, rand.nextInt(10), rand.nextInt(20));
    }
}
