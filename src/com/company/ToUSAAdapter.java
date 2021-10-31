package com.company;

public class ToUSAAdapter implements Travelling{ //YachtAdapter


    @Override
    public void byPlane() {
        System.out.println("Client uses yacht after the plane has landed");
        toUSA.byYacht();
    }

    private ToUSA toUSA;

    public ToUSAAdapter(ToUSA toUSA){
        this.toUSA = toUSA;
    }
}
