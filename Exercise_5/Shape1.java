
package com.ashvin.shape;

public class Shape{

        int dim1, dim2;
        Shape(int dim1 ,int dim2){
            this.dim1 = dim1;
            this.dim2 = dim2;
        }

        public int getDim1(){
            return this.dim1;
        }
        public int getDim2(){
            return this.dim2;
        }
        public void setDim1( int dim1){
           this.dim1 = dim1;
        }       
        public void setDim2( int dim2){
           this.dim2 = dim2;
        }
    }
    public class Shape1{
        public static void main(String[] args) {
            Shape s = new Shape();
            s.Shape(12 , 25);
            // s.();
        }
    }
