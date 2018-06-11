/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import csci152.impl.TowerOfHanoi;


/**
 *
 * @author Ляйля
 */
public class l23e1b {
    
    public static void finish(TowerOfHanoi yo) {
        boolean k = false;
        try {
            while (yo.isFinished() != true) {
                yo.moveDisc(0,1);
                try {
                    yo.moveDisc(0,2);
                } catch (Exception ex) {
                    k = true;
                }
                if (k) {
                    yo.moveDisc(2,0);
                    k = false;
                } 
                yo.moveDisc(1,2);
                try {
                    yo.moveDisc(0,1);
                } catch (Exception ex) {
                    k = true;
                }  
                if (k) {
                    yo.moveDisc(1,0);
                    k = false;
                } 
                yo.moveDisc(2,0);             
                try {
                    yo.moveDisc(1,2);
                } catch (Exception ex) {
                    k = true;
                }
                if (k) {
                    yo.moveDisc(2,1);
                    k = false;
                }
            }
        } catch (Exception ex) {
                System.out.println (ex.getMessage());
        }
    }

    
}
