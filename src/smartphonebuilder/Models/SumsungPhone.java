/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphonebuilder.Models;

/**
 *
 * @author Engah
 */
public class SumsungPhone extends SmartPhone{

    
    @Override
    public String toString() {
        return "SumsungPhone{" + super.getCpu()+ "/" + super.getGpu() + "/" + super.getRam() + "/" + super.getSensor() + "/" + super.getCase()+ '}';
    }
    
}
