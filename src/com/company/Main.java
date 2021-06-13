package com.company;

import java.util.List;
import java.util.Scanner;

import static com.company.DivideandConquer.solve;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bruteforce obj = new Bruteforce();

        Scanner sc =  new Scanner(System.in);
        //text
        System.out.println("======= Selamat Datang di String Matching =========");
        String source = "Menggali Peran Product Designer di Perkembangan Zaman \n" +
                "Apa Itu Product Designer ?\n" +
                "Product designer adalah peran yang bertanggung jawab atas pengalaman pengguna suatu aplikasi.\n" +
                "Meskipun biasanya terkait dengan aspek visual, tapi mereka kadang juga berperan dalam pembuatan arsitektur informasi.\n" +
                "Di beberapa perusahaan, peran ini disebut sebagai user experience designer, customer experience architect, dan user interface designer.\n" +
                "Perbedaan ini didasari oleh kebutuhan pekerjaan dan keragaman departemen dalam perusahaan tersebut. Pada umumnya, peran ini memiliki tugas yang amat penting selama pengembangan aplikasi.\n" +
                "Menurut Product Plan, saat fase awal desain dan konsep, mereka dapat menerjemahkan tujuan aplikasi menjadi pengalaman pengguna yang fungsional.\n" +
                "Pun demikian saat aplikasi tumbuh dan menambahkan lebih banyak fitur dan fungsi, mereka dapat memastikan pengalaman pengguna menjadi lebih intuitif.\n" +
                "Mereka juga bertugas membuat aplikasi jadi lebih efisien untuk meningkatkan kecepatan saat memuat halaman, dan lain-lain. Secara umum, desainer produk berorientasi agar bisnis perusahaan pemilik aplikasi lebih baik dibandingkan sebelumnya.\n" +
                "Untuk mendukung orientasi tersebut, mereka menggunakan desain yang telah dianalisis dan divalidasi. \n" +

                "Deskripsi Peran Profesi Product Designer\n" +
                "Secara umum, desainer produk berorientasi agar bisnis perusahaan pemilik aplikasi lebih baik dibandingkan sebelumnya.\n" +
                "Untuk mendukung orientasi tersebut, mereka menggunakan desain yang telah dianalisis dan divalidasi. Menurut Novoda, berikut beberapa tugas dasar mereka.\n" +

                "Melakukan riset dan penelitian\n" +
                "Tujuan dari riset dan penelitian ini adalah untuk mengetahui pengalaman pengguna.\n" +
                "Ada dua metode riset, yakni kualitatif (wawancara pengguna dan tes penggunaan) dan metode penelitian kuantitatif (data dan analitik).\n" +
                "Hasil dari riset dan penelitian lantas dianalisis secara terstruktur ini mengetahui apa saja hal yang bisa dibuat atau diperbaiki.\n" +
                "Di beberapa perusahaan, riset dan penelitian bahkan mendapat tempat khusus karena berpengaruh dalam pembuatan rencana bisnis yang baru.\n" +

                "Merencanakan fitur dalam aplikasi\n" +
                "Dalam beberapa kesempatan, seorang product designer berperan untuk merencanakan fitur baru.\n" +
                "Tentunya, proses ini berjalan dengan undangan pemangku kepentingan, seperti product owner atau product manager, engineer, dan business development.\n" +
                "Biasanya, proses ini disebut sprint planning dan berjalan dalam waktu lima hari.\n" +

                "Design thinking\n" +
                "Design thinking mengacu pada proses kognitif, strategis, dan praktis pada proses pembuatan desain.\n" +
                "Proses ini bisa dilakukan baik untuk pembuatan desain pada fitur baru atau desain pada fitur yang dikembangkan.\n" +
                "Proses ini dilakukan untuk membuat inovasi agar aplikasi bisa lebih baik dari yang sebelumnya.\n" +
                "Sementara, tujuan jangka panjang dari design thinking adalah menambah nilai aplikasi baik dalam konteks bisnis maupun sosial. \n" +

                "Membuat prototipe\n" +
                "Prototipe adalah cara yang digunakan untuk dengan merasakan bagaimana pengguna akan berinteraksi dengan aplikasi.\n" +
                "Di prototipe, product designer akan melihat apakah desain yang dibuat sudah sesuai permintaan para pemegang keputusan.\n" +
                "Biasanya, proses ini digunakan untuk mengecek dua hal, yakni user journey dan interaksi, serta transisi desain.\n" +
                "User journey mengarah kepada apa yang bisa dilakukan oleh pengguna, sementara interaksi dan transisi lebih mengarah ke teknis desain.\n" +

                "Kualifikasi dan Skill yang Diperlukan\n" +
                "Beberapa perusahaan mensyaratkan posisi ini diisi oleh alumnus desain komunikasi visual atau teknik informatika. Namun, ada pula perusahaan-perusahaan yang tidak mengacu pada gelar pendidikan tertentu. \n" +
                "\n" +
                "Sementara itu, untuk skill, ada beberapa hal yang berkaitan dengan deskripsi pekerjaan yang wajib dimiliki oleh seorang product designer. Berikut beberapa di antaranya.\n" +
                "Kemampuan desain pada product designer\n" +
                "Riset dan penelitian\n" +
                "Menciptakan prototipe produksi.";
        //word that want to be matched in the text
        System.out.print("Cari Kata : ");
        String pattern;
        pattern = sc.nextLine();

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
    }
}
