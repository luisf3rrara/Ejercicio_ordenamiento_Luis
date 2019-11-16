
package seleccion;

public class Seleccion {
    
    public static void main(String[] args) {
        //ejerciocxcicoaspoas
        ordenamiento_seleccion os = new ordenamiento_seleccion ();
        int num[] = {7,4,25,14,1};
        
        os.sort(num);
        
        
        System.out.println("Sorted Array");
        os.printArray(num);
              
        
        }
    }
       