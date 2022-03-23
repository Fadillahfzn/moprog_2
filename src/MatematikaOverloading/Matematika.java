package MatematikaOverloading;

public class Matematika {
    // pertambahan
    void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Pertambahan");
        System.out.println("Hasil: " +hasil);
    }

    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil: " +hasil);
    }
    
    // pengurangan
    void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("\nPengurangan");
        System.out.println("Hasil: " + hasil);
    }
    
    void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.println("Hasil: " + hasil);
    }
    
    // perkalian
    void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("\nPerkalian");
        System.out.println("Hasil: " + hasil);
    }
    
    void perkalian(double a, double b) {
        double hasil = a * b;
        System.out.println("Hasil: " + hasil);
    }
    
    // pembagian
    void pembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("Pembagian");
        System.out.println("Hasil: " + hasil);
    }
    
    void pembagian(double a, double b) {
        double hasil = a / b;
        System.out.println("Hasil: " + hasil);
    }
}
