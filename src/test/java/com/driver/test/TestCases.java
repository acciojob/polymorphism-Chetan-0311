package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
     class Product{
           public int product(int x, int y, int z){
                 return x * y * z;
           }
          public double product (double x, double y){
                 return x * y;
          }
     }
     
     public static void main(String[] args){
          Product p = new Product();
          p.product (5,6,7);
          p.prosuct(5.5,6.6);
     }     
}
