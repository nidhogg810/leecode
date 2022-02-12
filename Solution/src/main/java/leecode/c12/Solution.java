package leecode.c12;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String intToRoman(int num) {
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
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<models.size();++i){
            while (num>=models.get(i).num){
                int x = num/models.get(i).num;
                for(int t=0; t<x;++t) {
                    sb.append(models.get(i).ch);
                }
                num = num%models.get(i).num;
            }
        }
        return sb.toString();
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
