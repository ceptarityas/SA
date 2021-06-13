package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static com.company.DivideandConquer.solve;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Bruteforce obj = new Bruteforce();
        FileReader file = new FileReader("E:/Ekstensi/Semester 2/Strategi Algoritma/Apa Itu UI Design.txt");
        BufferedReader reader = new BufferedReader(file);
        long startTime = System.nanoTime();
        Scanner sc =  new Scanner(System.in);
        //text
        System.out.println("======= Selamat Datang di String Matching =========");
        String source = "";
        String line = reader.readLine();
        //word that want to be matched in the text
        System.out.print("Cari Kata : ");
        String pattern;
        pattern = sc.nextLine();

        while (line != null)
        {
            source += line;
            line = reader.readLine();
        }
        //calling the function
        int position = obj.bruteforce(source,pattern);
        int endindex = position+1;
        //condition to check whether the pattern is matched are not
        if(position == -1){
            System.out.println();
            System.out.println("Pattern tidak cocok");
        }else{
            System.out.println();
            System.out.println("Brute Force");
            System.out.println("Himpunan list '"+pattern+"' berada di posisi [" + (position+1)+","+ (endindex + pattern.length())+"]");
        }

        System.out.println();
        System.out.println("Knuth-Morris-Pratt");
        new KMP().KMPSearch(pattern, source);

        System.out.println();
        System.out.println("Divide and Conquer");
        List res = solve(source, pattern);
        if (res != null) {
            System.out.println("[" + res.get(0) + ", " + res.get(res.size() - 1) + "]");
        } else {
            System.out.println("Null");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Running Time yang dibutuhkan : "+totalTime+" nanosecond");
    }
}
