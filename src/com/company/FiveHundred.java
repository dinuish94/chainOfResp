package com.company;

/**
 * Created by dinukshai on 5/31/2016.
 */
public class FiveHundred implements Notes {

    private Notes note;

    @Override
    public void setNextNote(Notes nextNote) {
        this.note = nextNote;
    }

    @Override
    public void HowMany(int amount) {
        if(amount>=500){
            int num =  (amount / 500);
            int remainder = amount % 500;
            System.out.println(num+" 500 notes");
        }
        else{
            //note.HowMany(amount);
        }
    }
}
