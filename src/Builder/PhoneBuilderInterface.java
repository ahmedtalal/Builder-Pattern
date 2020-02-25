/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import smartphonebuilder.Models.SmartPhone;

/**
 *
 * @author Engah
 */
public interface PhoneBuilderInterface {
    
    public void addCpu(String cpu) ;
    public void addGpu(String gpu) ;
    public void addRam(String ram) ;
    public void addSensor(String sensor) ;
    public void addCase(String casee) ;
    public SmartPhone getPhone() ;
}
