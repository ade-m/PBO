package app.Model;

import java.util.Date;

public class Mahasiswa extends User{
    private String studentID,nama,jurusan,tahun_masuk;

    public Mahasiswa(String studentID, String nama, String jurusan, String tahun_masuk) {
        super();
        this.studentID = studentID;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahun_masuk = tahun_masuk;
    }

    public Mahasiswa(String username, String password, Date tglJoin,String studentID, String nama, String jurusan, String tahun_masuk) {
        super(username,password,tglJoin);
        this.studentID = studentID;
        this.nama = nama;
        this.jurusan = jurusan;
        this.tahun_masuk = tahun_masuk;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getTahun_masuk() {
        return this.tahun_masuk;
    }

    public void setTahun_masuk(String tahun_masuk) {
        this.tahun_masuk = tahun_masuk;
    }

    @Override
    public void cetakDataUser(){
        super.cetakDataUser();
        System.out.println("Student ID : "+getStudentID()+"\n"
        +"Nama : "+getNama()+"\n"
        + "Jurusan : "+getJurusan()+"\n"
        + "Tahun Masuk : "+getTahun_masuk()+"\n");
    }


}