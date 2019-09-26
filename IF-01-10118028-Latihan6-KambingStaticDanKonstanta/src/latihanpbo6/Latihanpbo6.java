/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo6;

/**
 *
 * @author User
 *  NAMA      : Surya Fakhriy Hasbi
    KELAS     : IF-1 2018
    NIM       : 10118028
    DESKRIPSI : Kambing static dan konstanta
 */

public class Mamalia {
    //variabel jumlah Kambing dideklarasian sebagai static
    public static int jumlahKambing;
}

public class Latihanpbo6 {
    //NAMA_KAMBING sebagai konstanta    
    public static final String NAMA_KAMBING = "Midun";  

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}
