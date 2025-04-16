/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot2_a;

import java.util.ArrayList;

/**
 *
 * @author l26m1
 */
public class Slot2_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();        
        list1.add(27);
        list1.add(12);
        
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
        }
        
//        list1.remove(0);
//        list1.remove(list1.size()-1);

        list1.add(2, -1);
        list1.add(list1.size()-1, -100);
        
        list1.indexOf(5); // Vị trí
        list1.get(list1.indexOf(5));
        
        System.out.println("Số lượng: "+ list1+" || "+list1.size()
                +"\nVị trí số: "+ list1.indexOf(5)
                +"\n- "+ list1.get(list1.indexOf(9)));
    }
}
