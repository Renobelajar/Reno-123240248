/*
*Kelas : IF-F
*NIM : 123240248
*NAMA : Reno Miftahudin
*/
package Main;
import model.KaryawanDAO;
import View.Karyawan.ViewData;
import controller.KaryawanController;


public class Main {
    public static void main(String[] args) {
        try{
            for 
                    (javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookandfeels())
            {
                if"Nimbus".equals(info.getName))){
                javax.swing.UIManager.setLookAndFeel(info.getClassName()):
                break;
            }
           }
          }catch(Exception e){
              System.err.pritln("Gagal memuat LookAndFeel:" + e.getMessage());    
        } 
        KaryawanDAO() model = new KaryawanDAO();
        View Data View.Karyawan = new ViewData();
        
        ViewData.setVisible(true)
    }
}