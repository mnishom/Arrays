package array.contoh.kelasa;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Object> buku = new ArrayList<>();
        buku.add("Judul\t: K-Means Clustering Methods");
        buku.add(2018);
        for (int i = 0; i < buku.size(); i++) {
            //System.out.println(buku.get(i));
        }
        
        List<String[]> mhs = new ArrayList<>();
        mhs.add(new String[]{"123","Wiwit","3A"});
        mhs.add(new String[]{"124","Yahya","3A"});
        for (int i = 0; i < mhs.size(); i++) {
            for (int j = 0; j < mhs.get(i).length; j++) {
                System.out.println(""+mhs.get(i)[j]);
            }
        }
    }
}
