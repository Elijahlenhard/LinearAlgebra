package com.company;

public class Matrix {


    private double[][] matrix;
    int id =  0; /*

    the id system is used to identify states of the matrix.
    0: uninitialized matrix
    1: valid matrix
    2: square matrix
    3: a square matrix was required and a non-square matrix was supplied.



    */

    public Matrix(int dim1, int dim2){

        this.matrix = new double[dim1][dim2];


    }
    public Matrix(int id){
        this.id = id;
    }
    public void setIndex(int dim1, int dim2, double value){
        matrix[dim1][dim2] = value;
    }
    public double getIndex(int dim1, int dim2){
        return matrix[dim1][dim2];
    }
    public String toString(){

        String output = "";

        for(int i =0; i<matrix.length; i++){
            output += "|";
            for(int j =0; j<matrix[0].length; j++){
                output+= " " + matrix[i][j] + " ";

            }
            output +="|\n";

        }

        return output;
    }

    public Vector multiplyByVector(Vector vector, boolean log){

        if(matrix.length != matrix[0].length){ //ensures that the matrix is square
            return vector;
        }
        if(vector.getDim() != matrix.length){//ensures the vector is the same height as the matrix
            return vector;
        }

        Vector calcVector = new Vector(vector.getDim());

        if(log) {

            System.out.println("| " + matrix[0][0] + "  " + matrix[0][1] + " | |" + vector.getIndex(0) + "|");
            System.out.println("| " + matrix[1][0] + "  " + matrix[1][1] + " | |" + vector.getIndex(1) + "|");
        }

        for(int dim1 =0; dim1 < matrix.length; dim1++){

            for(int dim2 = 0; dim2<matrix.length; dim2++){

                calcVector.setIndex(dim1, calcVector.getIndex(dim1) + matrix[dim1][dim2]*vector.getIndex(dim2));
            }
        }

        return calcVector;

    }

    //   2  3
    //   4  6
    //
    //
    public Matrix getEigenBasis(){

        if(this.matrix.length != this.matrix[0].length){
            return new Matrix(3);
        }
        Matrix eigen = new Matrix(this.matrix.length, this.matrix[0].length);

        if(eigen.matrix.length == 2){

            double lambda = -matrix[0][0]-matrix[1][1];
            double real = (matrix[0][0]*matrix[1][1]) - (matrix[0][1]*matrix[1][0]);

            CharPoly charPoly = new CharPoly(lambda,real);

            double discriminate = (lambda*lambda) - 4*real;
            if(discriminate>0);

            double eigen1 = (-lambda+Math.sqrt(discriminate))/2;
            double eigen2 = (-lambda-Math.sqrt(discriminate))/2;

            if(eigen1 != eigen2){



            }


        }

        return eigen;
    }

}
