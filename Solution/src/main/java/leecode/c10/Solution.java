package leecode.c10;

import java.util.Arrays;

public class Solution {
    /**
     *
     * @param s 被匹配的字符串
     * @param p '.'和'*'的正则表达式；'.'匹配任意单个字符,'*'匹配零个或多个前面的那一个元素
     * @return
     */
    public boolean isMatch(String s, String p) {
        int sLeng = s.length();
        int pLeng = p.length();
        boolean[][] f = new boolean[sLeng+1][pLeng+1];
        f[0][0] = true;
        for(int i = 0;i<=sLeng;++i){
            for(int j=1;j<=pLeng;++j){
                //匹配 s 末尾的一个字符，将该字符扔掉，而该组合还可以继续进行匹配；
                //不匹配字符，将该组合扔掉，不再进行匹配。
                if(p.charAt(j-1)=='*'){
                    f[i][j] = f[i][j-2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j]||f[i-1][j];
                    }
                }else {
                    if(matches(s,p,i,j)){
                        f[i][j] = f[i-1][j-1];
                    }
                }
            }
        }

        return f[sLeng][pLeng];
    }


    private boolean charEquals(char c1,char c2){
        return (c1==c2||c1=='.')&&c2!='*';
    }

    private boolean matches(String s,String p,int i,int j){
        if(i==0){
            return false;
        }
        if(p.charAt(j-1)=='.'){
            return true;
        }
        return s.charAt(i-1) == p.charAt(j-1);
    }

    private void println(boolean[][] f){
        System.out.print("[");
        for(int i=0;i<f.length; ++i){
            for(int j=0;j<f[i].length; ++j){
                System.out.print(f[i][j]+",");
                if(j == f[i].length-1){
                    System.out.print('\n');
                }
            }
        }
        System.out.print("]\n");
    }
}
