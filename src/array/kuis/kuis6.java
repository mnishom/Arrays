package array.kuis;

public class kuis6 {
    
    public static void main(String[] args) {
        //Object[] data = {15,"A",12.1,'C',14f,(50>49),78d};
    
    Object[] data = {new String[]{"X","Y","Z"},15,"A",12.1,'C',14f,(50>49),78d};
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks: "+i);
            System.out.println("Data: "+data[i]);
            String tipe = "";
            if(data[i] instanceof Integer){                
                tipe = "Integer";
            }else if(data[i] instanceof String){
                tipe = "String";
            }else if(data[i] instanceof Float){
                tipe = "Float";
            }else if(data[i] instanceof Double){
                tipe = "Double";
            }else if(data[i] instanceof Character){
                tipe = "Character";
            }else if(data[i] instanceof Boolean){
                tipe = "Boolean";
            }else if(data[i] instanceof Object){
                tipe = "Object";
            }
            System.out.println("Tipe: "+tipe);
            System.out.println("==============");
        }
    }
}
