package com.company;

/**
 * Created by dinukshai on 5/30/2016.
 */
public class TwoThousand implements Notes {

    private Notes note;

    @Override
    public void setNextNote(Notes next) {
        this.note = next;
    }

    @Override
    public void HowMany(int amount) {
        if(amount>=2000){
            int num = (amount/2000);
            int remainder = amount%2000;
            System.out.println(num+" 2000 notes");

            if(remainder!=0){
                this.note.HowMany(remainder);
            }
        }
        else {
            this.note.HowMany(amount);
        }
    }
}
