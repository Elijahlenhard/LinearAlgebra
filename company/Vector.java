package com.company;

public class Vector {

    private double[] vector;


    public Vector (int dim){
        this.vector = new double[dim];
        for(int i =0; i<dim; i++){
            this.vector[i] =0;
        }
    }
    public Vector(double[] data){
        this.vector = new double[data.length];
        for(int i =0; i<vector.length; i++){
            vector[i] = data[i];
        }

    }
    public void setIndex(int index, double value){
        vector[index] = value;
    }
    public double getIndex(int index){
        return vector[index];
    }

    public int getDim(){
        return vector.length;
    }
    public String toString(){

        String output = "<";

        for(int i = 0; i<vector.length; i++){
            if(i != 0) {
                output += ", ";
            }
            output += vector[i];


        }
        output += ">";
        return output;

    }


}
