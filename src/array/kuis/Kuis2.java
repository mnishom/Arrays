package array.kuis;

public class Kuis2 {
    
    public static void main(String[] args) {
        int[][] nilai = new int[4][2];        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if(i%2 == 0){
                    nilai[i][j] = i+1;
                }else{
                    nilai[i][j] = i+j;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("nilai["+i+"]["+j+"] = "+nilai[i][j]);
            }
        }
    } 
}
