package tutorial;

class mahasiswa{
    // data member/ciri/atribut
        String nama;
        String nim;
        String prodi;

     //membuat konstruktor parameter
     mahasiswa( String inputnama, String inputnim, String inputprodi){
        nama = inputnama;
        nim  = inputnim;
        prodi= inputprodi;

        System.out.println("nama : "+ nama);
        System.out.println("nim :"+ nim);
        System.out.println("prodi :"+ prodi);


     }

}

public class CobaKonstruktor {
    public static void main (String[] args) {
        mahasiswa mhs1 = new mahasiswa("zahra", "21241086", "PTI");
        //masukkan nilai objek

        mahasiswa mhs2 = new mahasiswa("nurul", "22241076", "PTI");

    }
}
