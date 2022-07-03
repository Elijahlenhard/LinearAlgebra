package com.company;

public class Main {

    public static void main(String[] args) {

        Matrix testMatrix = new Matrix(2,2);
        testMatrix.setIndex(0, 0, 2);
        testMatrix.setIndex(0, 1, 1);
        testMatrix.setIndex(1, 0, 3);
        testMatrix.setIndex(1, 1, 4);



        Vector testVector = new Vector(new double[] {2,3});
        //System.out.println(testVector);
        System.out.println(testMatrix);
        System.out.println(testMatrix.multiplyByVector(testVector, true));



    }
}
