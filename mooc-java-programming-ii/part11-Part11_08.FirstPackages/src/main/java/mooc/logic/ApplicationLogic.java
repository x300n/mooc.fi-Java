/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

/**
 *
 * @author xeon
 */
public class ApplicationLogic {
    
    private final UserInterface ti;
    public ApplicationLogic(UserInterface ui){
         
        this.ti = new TextInterface();

    }
    
    public void execute(int times){
        
        while(times > 0){
            System.out.println("Application logic is working");
            ti.update();
            times--;
        }
        
    }
    
}
