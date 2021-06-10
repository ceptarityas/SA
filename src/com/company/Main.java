package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bruteforce obj = new Bruteforce();
        Scanner sc =  new Scanner(System.in);
        //text
        String text = "Desain User Interface (UI) adalah proses yang digunakan desainer untuk membuat tampilan dalam perangkat lunak atau perangkat terkomputerisasi, dengan fokus pada tampilan atau gaya. Tujuan dari desainer UI adalah untuk membuat desain antarmuka yang membuat pengguna mudah untuk digunakan dan menyenangkan. Apakah UI Desain dan UX Desain itu sama ? Jawabannya adalah berbeda karena desain UI lebih menitik beratkan pada desain permukaan dan keseluruhan nuansa desain. Salah satu analoginya adalah membayangkan desain UX sebagai mobil dengan desain UI sebagai alat penggeraknya.";
        //word that want to be matched in the text
        System.out.print("Cari Kata : ");
        String tobematched;
        tobematched = sc.nextLine();
        //calling the function
        int position = obj.bruteforce(text,tobematched);
        int endindex = position+1;
        //condition to check whether the pattern is matched are not
        if(position == -1){
            System.out.println("Pattern is not matched in the text");
        }else{
            System.out.println("Found at position:" + (position+1));
            System.out.println("End at the position:" + (endindex + tobematched.length()));
        }
    }
}
