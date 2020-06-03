package app;

public class Mahasiswa {
    private int nim;
    private String address,name;

    public Mahasiswa(){}
    
    public Mahasiswa(int nim, String address, String name) {
        this.nim = nim;
        this.address = address;
        this.name = name;
    }


    public int getNim() {
        return this.nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "{" +
            " nim='" + getNim() + "'" +
            ", address='" + getAddress() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
    
}