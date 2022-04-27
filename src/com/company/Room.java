package com.company;

public class Room implements Comparable<Room> {
    private double width;
    private double length;
    private int floor;

    public Room() {
        width = 10;
        length = 12.5;
        floor = 1;
    }

    public Room(double dim0, double dim1, int floor) {
        setWidth(Math.min(dim0, dim1));
        setLength(Math.max(dim0, dim1));
        setFloor(floor);
    }

    public String toString() {
        return length + " x " + width + " on floor " + floor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int compareTo(Room otherRoom) {
        double comparison = getFloor() != otherRoom.getFloor() ? getFloor() - otherRoom.getFloor() :
                getLength() != otherRoom.getLength() ? getLength() - otherRoom.getLength() :
                        getWidth() != otherRoom.getWidth() ? getWidth() - otherRoom.getWidth() : 0;
        return comparison < 0 ? -1 : comparison > 0 ? 1 : 0;
    }
}
