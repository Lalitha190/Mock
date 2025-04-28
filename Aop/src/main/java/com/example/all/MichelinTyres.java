package com.example.all;

import org.springframework.stereotype.Component;

@Component 

public class MichelinTyres implements Tyre{ 

 



    public String rotate(){ 

        return "Vehicle moving with the help of BridgeStone tyres"; 

    } 

 

    @Override 

    public String stop() { 

        return "Vehicle stopped with the help of BridgeStone tyres"; 

    } 

 

} 