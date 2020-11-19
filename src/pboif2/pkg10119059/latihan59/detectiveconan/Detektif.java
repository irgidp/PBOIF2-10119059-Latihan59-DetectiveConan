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
public class Detektif {
    protected String nama;
    protected String ciri;
    
    public Detektif(String nama, String ciri){
        this.nama = nama;
        this.ciri = ciri;
    }
    
    public void tampil(){
        System.out.println("Nama : " +nama);
        System.out.println("Ciri : " +ciri);
    }
}
