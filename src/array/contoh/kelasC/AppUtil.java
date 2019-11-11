package array.contoh.kelasC;

import javax.swing.table.DefaultTableModel;

public final class AppUtil {
    
    private AppUtil(){
        
    }
    
    public static String user_dir(){
        return System.getProperty("user.dir");
    }
    
    public static DefaultTableModel app_table_model(){
        Object[] header = {"No.","Nama","Kelas","Angkatan"};
        DefaultTableModel model = new DefaultTableModel(header, 0);
        return model;
    }
    
    
    
    
}
