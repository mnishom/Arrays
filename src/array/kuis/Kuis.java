package array.kuis;

public class Kuis {
    
    public static void main(String[] args) {
//        int[][] nilai = new int[5][];
//        System.out.println(nilai.length);
//        nilai[0] = new int[3];
//        nilai[0][0] = 123;
//        nilai[0][1] = 124;
//        nilai[0][2] = 125;
//        nilai[1] = new int[4];
//        nilai[1][0] = 126;
//        nilai[1][1] = 127;
//        nilai[1][2] = 128;
//        nilai[1][3] = 129;
//        System.out.println("nilai[0][0] => "+nilai[0][0]);
//        System.out.println("nilai[1][0] => "+ nilai[1][0]);
    
        int n[][] = new int[5][];
        for (int i = 4; i < n.length; i++) {
            int cSize = i+1; //5
            n[i] = new int[cSize];
            for (int j = 0; j < cSize; j++) {
                n[i][j] = j+1;
                System.out.print(n[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
