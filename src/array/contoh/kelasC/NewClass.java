package array.contoh.kelasC;

import com.sun.org.apache.xerces.internal.xs.XSConstants;
import java.util.ArrayList;
import java.util.List;

public class NewClass {
    public static void main(String[] args) {
        Object[] data1 = new Object[2];
        data1[0] = 1;
        data1[1] = 2;
        
        int p = data1.length;
        
        List<List> data2 = new ArrayList();
        List row = new ArrayList();
        
        for (int i = 1; i <= 10; i++) {
            row.add(i);
        }
        
    }
}
