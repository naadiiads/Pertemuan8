package overriding;

public class mahasiswa {
    String sapaan;
    public mahasiswa() {
        System.out.println("Saya adalah seorang mahasiswa");
    }
    public void sapaan() {
        System.out.println("Halo!");
    }
    
    public static void main(String[] args) {
        mahasiswa m = new mahasiswa();
        m.sapaan();
        mahasiswa1 a = new mahasiswa1();
        a.sapaan();
            System.out.println("\n");
        mahasiswa2 b = new mahasiswa2();
        b.sapaan();
            System.out.println("\n");
        mahasiswa3 c = new mahasiswa3();
        c.sapaan();
            System.out.println("\n");
    }
}
    
class mahasiswa1 extends mahasiswa {
    String nama;
    String asal;
    public mahasiswa1() {
        super();
        nama="Nadia";
        asal="Surabaya";
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Saya berasal dari "+asal);
    }
    
    public void sapaan(){
        System.out.println("Salam Kenal <3");
    }
}

class mahasiswa2 extends mahasiswa {
    String nama;
    String asal;
    public mahasiswa2() {
        super();
        nama="Ami";
        asal="Pemalang";
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Saya berasal dari "+asal);
    }
    
    public void sapaan(){
        System.out.println("Salam Kenal <3");
    }
}

class mahasiswa3 extends mahasiswa {
    String nama;
    String asal;
    public mahasiswa3() {
        super();
        nama="Agnesya";
        asal="Jombang";
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Saya berasal dari "+asal);
    }
    
    public void sapaan(){
        System.out.println("Salam Kenal <3");
    }
}