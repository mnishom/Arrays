package array.contoh;

public class ArrayExample {
    
    private static void print(Object[] d){
        for (int i = 0; i < d.length; i++) {
            if(d[i] instanceof DataNilai){
                DataNilai n1 = (DataNilai) d[i];
                double cp1 = n1.getCompProgramming1();
                System.out.println(cp1);
            }else{
                System.out.println(d[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        DataNilai nilai = new DataNilai(100, 100, 90);
        Object[] data = {19092002, "Ajeng", "3B", 2018, nilai};
        print(data);
        
        // 12 - ANGKA_NIM
              
        int[] data3 = new int[19092002];
        for (int i = 12; i <= 19092002; i++) {
            data3[i-12] = i;
        }
        
        System.out.println("=>"+data3.length);
        for (int i : data3) {
            System.out.println("-> "+i+"\n");
        }
        
        
        
        int a = 1;        
        int[] data2 = {1,2,3,a};
        for (int i = 0; i < data2.length; i++) {
            if(i == data2.length-1){
                System.out.println(a); // tidak boleh
            }else{
                System.out.println(data2[i]);
            }
        }
        
        
        
//        for (Object object : data) {
//            System.out.println(object);
//        }
    }
}
