/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author soa-a306-e-007
 */
class ordenamiento_seleccion {
    
    //terecaskas
    
    void sort (int num[]) {
        
        int n = num.length;
        
        for (int i =0; i < n-1; i ++) {
        
        int min_idx =i; 
        for (int j = i+1; j <n; j++)
            min_idx =j;
        
        
        int temp = num [min_idx];
        num[min_idx]=num[i];
        num[i] = temp;
    }
        
    }

    void printArray(int[] num) {
        
        int n =num.length;
        for (int i=0; i<n; ++i)
            System.out.println(num[i]+"");
        System.out.println();

}
}
