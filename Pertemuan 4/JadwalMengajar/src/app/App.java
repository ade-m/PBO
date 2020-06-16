package app;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author budiono
 * tgl buat 
 * 
 */
public class App {
    public static Scanner inputan = new Scanner(System.in);    
    public static ArrayList <Dosen> datadosen = new ArrayList<Dosen>();
    public static ArrayList <Matakuliah> dataMataKuliah = new ArrayList<Matakuliah>();
    public static ArrayList <Jadwal> dataJadwal = new ArrayList<Jadwal>();
    
    public static void main(String[] args) throws Exception {
        int pilhanMenu=0;
        init();
        System.out.println("JLh Dosen : "+ hitungJumlahData(datadosen, true));
        System.out.println("JLh Matakuliah : "+ hitungJumlahData(dataMataKuliah, 0.0));
        System.out.println("JLh Jadwal : "+ hitungJumlahData(dataJadwal, 0));
        do{
            cetakMenu();
            pilhanMenu = inputan.nextInt();
            inputan.nextLine();
            inputan = new Scanner(System.in);    
            if(pilhanMenu==1){
                Dosen tmpDosen = inputDataDosen();
                datadosen.add(tmpDosen);
            }else if(pilhanMenu==2){
                Matakuliah tmpMatakuliah = inputDataMatakuliah();
                dataMataKuliah.add(tmpMatakuliah);
             }else if(pilhanMenu==3){
               Jadwal tmpJadwal = inputDataJadwal();
               dataJadwal.add(tmpJadwal);
            }else if(pilhanMenu==4){
                tampilkanDataDosen();
            }else if(pilhanMenu==5){
                tampilkanDataMatakuliah();
            }else if(pilhanMenu==6){
                tampilkanDataJadwal();
            }
        }while(pilhanMenu!=0);
        inputan.close();
    }
    
    public static void cetakMenu(){
        System.out.println("\nMenu:");
        System.out.println("1. Tambah data dosen");
        System.out.println("2. Tambah data matakuliah");
        System.out.println("3. Tambah data jadwal");
        System.out.println("4. Lihat data dosen");
        System.out.println("5. Lihat data matakuliah");
        System.out.println("6. Lihat data jadwal");
        System.out.println("0. Keluar");
        System.out.print("Masukkan Pilihan anda:");
    }
    public static void init(){
        datadosen.add(new Dosen("D0001", "Budi", "Medan", "01011880"));
        datadosen.add(new Dosen("D0002", "Susi", "Medan", "01011880"));
        datadosen.add(new Dosen("D0003", "Handoko", "Medan", "01011880"));
        datadosen.add(new Dosen("D0004", "Micheal", "Medan", "01011880"));
        dataMataKuliah.add(new Matakuliah("M0001", "PBO"));
        dataMataKuliah.add(new Matakuliah("M0002", "Algoritma"));
        dataMataKuliah.add(new Matakuliah("M0003", "Kalkulus"));
        dataMataKuliah.add(new Matakuliah("M0004", "Datamining"));
        dataMataKuliah.add(new Matakuliah("M0005", "Big Data"));
        dataMataKuliah.add(new Matakuliah("M0006", "Digtal Marketing"));
    }

    /*
    * Fungsi untuk cek kode dosen tersedia atau tidak
    *
    */
    public static boolean cekDataDosen(String kodeDosen){
        for(int i =0;i<datadosen.size();i++){
            if(datadosen.get(i).getKddosen().equals(kodeDosen)){
                return true;
            }
        }
        return false;
    }
    /** 
    * Fungsi untuk cek kode matakuliah tersedia atau tidak
    *
    **/
    public static boolean cekDataMatakuliah(String kodeMatakuliah){
        for(int i =0;i<dataMataKuliah.size();i++){
            if(dataMataKuliah.get(i).getKdmatkul().equals(kodeMatakuliah)){
                return true;
            }
        }
        return false;
    }

    
    /*
    * Fungsi untuk mengambil data berdasarkan kode dosen yg tersedia 
    *
    */
    public static Dosen getDataDosen(String kodeDosen){
        for(int i =0;i<datadosen.size();i++){
            if(datadosen.get(i).getKddosen().equals(kodeDosen)){
                return datadosen.get(i);
            }
        }
        return null;
    }
    /*
    * Fungsi untuk mengambil data kode matakuliah yg tersedia 
    *
    */
    public static Matakuliah getDataMatakuliah(String kodeMatakuliah){
        for(int i =0;i<dataMataKuliah.size();i++){
            if(dataMataKuliah.get(i).getKdmatkul().equals(kodeMatakuliah)){
                return dataMataKuliah.get(i);
            }
        }
        return null;
    }
    /*
    * Fungsi untuk input data dosen
    *
    */
    public static Dosen inputDataDosen(){
        String kddosen,nama,alamat,tgllahir;
       
        inputan = new Scanner(System.in); 
        System.out.print("Input Kode Dosen :");
        kddosen=inputan.nextLine();
        System.out.print("Input Kode Nama :");
        nama=inputan.nextLine();
        inputan.nextLine(); //jeda 1 enter => baris baru
        System.out.print("Input Kode Alamat :");
        alamat=inputan.nextLine();
        System.out.print("Input Kode Tgl Lahir :");
        tgllahir=inputan.nextLine();
        inputan.close();
        return new Dosen(kddosen, nama, alamat, tgllahir);
    }

     /*
    * Prosedur untuk menampilkan data dosen
    *
    */
    public static void tampilkanDataDosen(){
        System.out.print("Data Dosen :\n");
        for(int i =0;i<datadosen.size();i++){
            System.out.print(datadosen.get(i));
        }
    }

      /*
    * Fungsi untuk input data dosen
    *
    */
    public static Jadwal inputDataJadwal(){
        String kdmatkul,kdDosen,jammulai,jamakhir;
        do{
            System.out.print("Input Kode Dosen:");
            kdDosen=inputan.nextLine();
            if(!cekDataDosen(kdDosen)){
                System.out.println("Data Dosen Tidak ditemukan!!!");
            }    
        }while(!cekDataDosen(kdDosen));

        do{
            System.out.print("Input Kode Matakuliah :");
            kdmatkul=inputan.nextLine();
            if(!cekDataMatakuliah(kdmatkul)){
                System.out.println("Data Matakuliah Tidak ditemukan!!!");
            }    
        }while(!cekDataMatakuliah(kdmatkul));
        
        System.out.print("Input Jam Mulai :");
        jammulai=inputan.nextLine();
        System.out.print("Input Jam Akhir :");
        jamakhir=inputan.nextLine();
        return new Jadwal(getDataDosen(kdDosen),getDataMatakuliah(kdmatkul),jammulai,jamakhir);
    }

     /*
    * Prosedur untuk menampilkan data Matakuliah
    *
    */
    public static void tampilkanDataJadwal(){
        System.out.print("Data Matakuliah :\n");
        System.out.print("==========================================================================\n");
        System.out.print("Nama Matakuliah\t\t\t Nama Dosen\t\t Jam Mulai \t Jam Akhir \n");
        System.out.print("==========================================================================\n");
        for(int i =0;i<dataJadwal.size();i++){
            System.out.println(dataJadwal.get(i).getMkul().getNmmatkul()
                                +"\t\t\t\t "+dataJadwal.get(i).getDosenmk().getNama()+"\t\t\t "
                                +dataJadwal.get(i).getJammulai()+"\t\t\t "+dataJadwal.get(i).getJamakhir()+"\n");
        }
    }

    /*
    * Fungsi untuk input data dosen
    *
    */
    public static Matakuliah inputDataMatakuliah(){
        
        inputan = new Scanner(System.in); 
        String kdmatkul,nmmatkul;
        System.out.print("Input Kode Matakuliah :");
        kdmatkul=inputan.nextLine();
        System.out.print("Input Nama Matakuliah:");
        nmmatkul=inputan.nextLine();
        inputan.close();
        return new Matakuliah(kdmatkul,nmmatkul);
    }

     /*
    * Prosedur untuk menampilkan data Matakuliah
    *
    */
    public static void tampilkanDataMatakuliah(){
        System.out.print("Data Matakuliah :\n");
        System.out.print("=====================================\n");
        System.out.print("Kode Mata Kuliah \t Nama Matakuliah\n");
        System.out.print("=====================================\n");
        for(int i =0;i<dataMataKuliah.size();i++){
            System.out.println(dataMataKuliah.get(i).getKdmatkul()+"\t\t\t "+dataMataKuliah.get(i).getNmmatkul());
        }
    }

    public static int hitungJumlahData(ArrayList <Dosen> dataDosen,Boolean tmp){
        return dataDosen.size();
    }
    public static int hitungJumlahData(ArrayList <Jadwal> dataJadwal,int tmp){
        return dataJadwal.size();
    }
    public static int hitungJumlahData(ArrayList <Matakuliah> dataMatakuliah, double tmp){
        return dataMatakuliah.size();
    }
    
}