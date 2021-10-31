package com.company;

public class Main {  //https://github.com/zukhra-dotcom/Adapter_pattern_Umarova_Zukhra.git

    public static void main(String[] args) {
	Client client= new Client();
	Travelling toRussia = new ToRussia();


	ToUSA toUSA = new ToUSA();
	ToUSAAdapter adapter = new ToUSAAdapter(toUSA);


	client.travellingToCountry(toRussia);
	client.travellingToCountry(adapter);
    }
}
