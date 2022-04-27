package com.company;

public class Classroom extends Room{
    private int numOfStudents;

    public Classroom(double dim0, double dim1, int floor, int numOfStudents) {
        super(dim0, dim1, floor);
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity = " + numOfStudents + " students";
    }
}
