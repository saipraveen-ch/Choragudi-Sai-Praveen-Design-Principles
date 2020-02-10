package com.praveen.EpamTaskCalculator;

public class Add extends Calculate {
	public String operation (String a,String b){
        float x = Float.parseFloat(a);
        float y = Float.parseFloat(b);
        float ans = x+y;
        int z = (int)ans;
        if(ans - z == 0) 
            return Integer.toString(z); 
        else 
            return Float.toString(ans);
    }
}
