package tutorial;

class polos{
    String datastring;
    int datainteger;
}

public class main {
    public static void main (String[]args){
        // instansiasi objek
        polos pls = new polos();

        //memberi nilai pada objek pls
        pls.datastring = "polos";
        pls.datainteger= 110;

        System.out.println("datastring : "+pls.datastring);
        System.out.println("datainteger :"+pls.datainteger);


    }
}