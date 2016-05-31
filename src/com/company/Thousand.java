package com.company;

/**
 * Created by dinukshai on 5/31/2016.
 */
public class Thousand implements Notes {
    private Notes note;

    @Override
    public void setNextNote(Notes next) {
        this.note = next;
    }

    @Override
    public void HowMany(int amount) {
        if(amount>=1000){
            int num =  (amount/1000);
            int remainder = amount%1000;
            System.out.println(num+" 1000 notes");
            if(remainder!=0){
                this.note.HowMany(remainder);
            }
        }
        else {
            this.note.HowMany(amount);
        }
    }
}
