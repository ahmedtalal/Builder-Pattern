/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import smartphonebuilder.Models.SmartPhone;
import smartphonebuilder.Models.SumsungPhone;

/**
 *
 * @author Engah
 */
public class SumsungBuilder implements PhoneBuilderInterface{
    
    private SumsungPhone sumsungPhone ;

    public SumsungBuilder() {
        sumsungPhone =  new SumsungPhone() ;
    }
    
    @Override
    public void addCpu(String cpu) {
        this.sumsungPhone.setCpu(cpu);
    }

    @Override
    public void addGpu(String gpu) {
        this.sumsungPhone.setGpu(gpu);
    }

    @Override
    public void addRam(String ram) {
        this.sumsungPhone.setRam(ram);
    }

    @Override
    public void addSensor(String sensor) {
        this.sumsungPhone.setSensor(sensor);
    }

    @Override
    public void addCase(String casee) {
        this.sumsungPhone.setCase(casee);
    }

    @Override
    public SmartPhone getPhone() {
        return sumsungPhone;
    }

}
