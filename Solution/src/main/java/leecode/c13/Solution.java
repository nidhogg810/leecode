package leecode.c13;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Mod> models = new ArrayList<Mod>(){{
        add(new Mod(1000,"M"));
        add(new Mod(900,"CM"));
        add(new Mod(500,"D"));
        add(new Mod(400,"CD"));
        add(new Mod(100,"C"));
        add(new Mod(90,"XC"));
        add(new Mod(50,"L"));
        add(new Mod(40,"XL"));
        add(new Mod(10,"X"));
        add(new Mod(9,"IX"));
        add(new Mod(5,"V"));
        add(new Mod(4,"IV"));
        add(new Mod(1,"I"));
    }};
    public int romanToInt(String s) {
        int num = 0;
        for(int i =0; i<models.size();){
            if(s.startsWith(models.get(i).ch)){
                num += models.get(i).num;
                s = s.substring(models.get(i).ch.length());
            }else{
                ++i;
            }
        }
        return num;
    }
    public class Mod{
        int num;
        String ch;
        Mod(int num,String ch){
            this.num = num;
            this.ch = ch;
        }
    }
}
