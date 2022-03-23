package MatematikaOverloading;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Matematika aksi = new Matematika();
        MatematikaCanggih aksiaksi = new MatematikaCanggih();

        aksi.pertambahan(5, 10);
        aksi.pertambahan(5, 3, 2);
        aksi.pengurangan(10, 5);
        aksi.pengurangan(10, 2, 3);
        aksi.perkalian(10, 2);
        aksi.perkalian(5.5, 2.5);
        aksi.pembagian(15, 3);
        aksi.pembagian(15, 2);
        aksiaksi.modulus(12, 3, 2);
    }
}
