package com.praveen.EpamTaskCalculator;

public class Divide extends Calculate {
    public String operation (String a,String b){
        float x = Float.parseFloat(a);
        float y = Float.parseFloat(b);
        if(y == 0)
            return "Cannot be divided by 0";
        float ans = x/y;
        int z = (int)ans;
        if(ans - z == 0) 
            return Integer.toString(z);
        else 
            return Float.toString(ans);
    }
}
