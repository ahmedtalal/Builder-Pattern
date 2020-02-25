/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartphonebuilder;

import Builder.PhoneBuilderInterface;
import java.util.ArrayList;
import smartphonebuilder.Models.SmartPhone;

/**
 *
 * @author Engah
 */
public class PhoneCreator {
    public SmartPhone getPhoneInstance(PhoneBuilderInterface phone , ArrayList<String> list){
        phone.addCpu(list.get(0));
        phone.addGpu(list.get(1));
        phone.addRam(list.get(2));
        phone.addSensor(list.get(3));
        phone.addCase(list.get(4));
        return phone.getPhone() ;
    }
}
