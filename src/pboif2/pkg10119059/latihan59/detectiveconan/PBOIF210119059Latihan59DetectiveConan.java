/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan detective conan
 */
package pboif2.pkg10119059.latihan59.detectiveconan;
/**
 *
 * @author Corazon
 */
public class PBOIF210119059Latihan59DetectiveConan {

    public static void main(String[] args) {
        
        DetektifNormal dNormal = new DetektifNormal("Ran Mouri", "Mudah menangis");
        System.out.println("==== Detektif Normal ====");
        dNormal.setKemampuan("Ran sangat tinggi terampil dalam karate tapi tidak ahli.");
        dNormal.tampil();
        System.out.println("");
        
        DetektifMini dMini = new DetektifMini("Ai Haibara", "Tampak seperti anak kecil dengan tinggi rata-rata dan memiliki kulit pucat");
        System.out.println("==== Detektif Mini ====");
        dMini.setKemampuan("Ai Haibara merupakan yang paling pintar");
        dMini.tampil();
    }
    
}
