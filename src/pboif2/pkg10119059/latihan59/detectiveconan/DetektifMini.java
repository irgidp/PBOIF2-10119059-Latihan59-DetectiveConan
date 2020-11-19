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
public class DetektifMini extends Detektif{

    private String kemampuan;
    
    public DetektifMini(String nama, String ciri) {
        super(nama, ciri);
    }
    
    public void setKemampuan(String kemampuan) {
        this.kemampuan = kemampuan;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Kemampuan : " + kemampuan);
    }
}
