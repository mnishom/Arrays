package array.contoh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayExample1 {
    
    public static void main(String[] args) {
        int[] n = new int[1000]; //instansiasi dan inisialisasi
        //mengisi nilai pada array n
        for (int i = 0; i < n.length; i++) {
            n[i] = i+1;
        }
        //mencetak nilai pada array n
        for (int i : n) {
            //System.out.println(i);
        }   
        
        
        //=>1    =>Nama1    =>D => 2018
        //....
        //=>1000 =>Nama1000 =>D => 2018
        
        String[] data1 = new String[1000];
        for (int i = 1; i <= 1000; i++) {
            //data1[i] = "=>"+i+"\t =>Nama"+i+"\t =>D \t =>2018";
        }
        
        for (String isi : data1) {
            //System.out.println(isi);
        }
        
        
        
        int[] dataNomor = new int[1000];
        String[] dataNama = new String[1000];
        String[] dataKelas = new String[1000];
        int[] dataAngkatan = new int[1000];
        
        for (int i = 0; i < 1000; i++) {
            dataNomor[i] = i+1;            
            dataNama[i] = "Nama"+(i+1);            
            dataKelas[i] = "D";            
            dataAngkatan[i] = 2018;            
        }
        
        for (int i = 0; i < 1000; i++) {
            /*System.out.println(""
                    + "=>"+dataNomor[i]+"\t"
                    + "=>"+dataNama[i]+"\t"
                    + "=>"+dataKelas[i]+"\t"
                    + "=>"+dataAngkatan[i]);*/
        }
        
        
        Object[] data = new Object[1000];
        for (int i = 0; i < 1000; i++) {
            data[i] = new Mahasiswa(i+1, 2018, "Nama"+(i+1), "D");
        }
        
        for (Object object : data) {
            if(object instanceof Mahasiswa){
                Mahasiswa m = (Mahasiswa) object;
                System.out.println(""
                        + "=>"+m.getNo()+"\t"
                        + "=>"+m.getNama()+"\t"
                        + "=>"+m.getKelas()+"\t"
                        + "=>"+m.getAngkatan());
            }
        }
        
        List<Mahasiswa> mhs = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            mhs.add(new Mahasiswa(i+1, 2018, "Nama"+(i+1), "D"));
        }
        
        for (Mahasiswa mh : mhs) {
            System.out.println(""
                        + "=>"+mh.getNo()+"\t"
                        + "=>"+mh.getNama()+"\t"
                        + "=>"+mh.getKelas()+"\t"
                        + "=>"+mh.getAngkatan());
        }
        
    }
}
