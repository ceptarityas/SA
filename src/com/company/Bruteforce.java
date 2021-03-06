package com.company;
import java.io.*;
import java.util.Scanner;

class Bruteforce {
    public static int bruteforce(String source,String pattern){
        int length = source.length();//length of the text
        int plength = pattern.length();//length of the pattern;

        //loop condition
        for(int i=0;i<length-plength;i++){
            //initialization of j
            int j=0;
            while((j < plength) && (source.charAt(i+j) == pattern.charAt(j))){
                j++;
            }
            if(j == plength){
                return i;
            }
        }
        return -1;
    }
}

