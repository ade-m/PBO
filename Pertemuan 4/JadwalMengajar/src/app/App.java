package app;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);    
        int pilhanMenu=0;
        ArrayList <Dosen> datadosen = new ArrayList<Dosen>();
        do{
            cetakMenu();
            pilhanMenu = inputan.nextInt();
            inputan.nextLine();
            inputan = new Scanner(System.in);    
            if(pilhanMenu==1){
                String kddosen,nama,alamat,tgllahir;
                System.out.print("INput Kode Dosen :");
                kddosen=inputan.nextLine();
            
                System.out.print("INput Kode Nama :");
                nama=inputan.nextLine();
                System.out.print("INput Kode Alamat :");
                alamat=inputan.nextLine();
                System.out.print("INput Kode Tgl Lahir :");
                tgllahir=inputan.nextLine();
                Dosen tmpDosen = new Dosen(kddosen, nama, alamat, tgllahir);
                datadosen.add(tmpDosen);
            }else if(pilhanMenu==4){
                System.out.print("Data Dosen :\n");
                for(int i =0;i<datadosen.size();i++){
                    System.out.print(datadosen.get(i));
                }
            }
        }while(pilhanMenu!=0);
        inputan.close();
       

    }
    public static void cetakMenu(){
        System.out.println("Menu:");
        System.out.println("1. Tambah data dosen");
        System.out.println("2. Tambah data matakuliah");
        System.out.println("3. Tambah data jadwal");
        System.out.println("4. Lihat data dosen");
        System.out.println("5. Lihat data matakuliah");
        System.out.println("6. Lihat data jadwal");
        System.out.println("0. Keluar");
        System.out.print("Masukkan Pilihan anda:");
    }
}