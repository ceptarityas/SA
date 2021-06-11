package com.company;

import java.util.ArrayList;
import java.util.List;

public class DivideandConquer {
    static List solve(String source,String pattern){
        List result = new ArrayList<>();
        List left;
        List right;
        //bagi ke 2 recursive kalau lebih besar dari panjang pattern
        if (source.length() > pattern.length()){
            left = solve(source.substring(0, pattern.length()), pattern);
            right = solve(source.substring(pattern.length()), pattern);

            if (left != null){
                return left;
            }else if (right != null){
                return right;
            }else {
                return null;
            }
        } else {
            //kalau tidak bisa dibagi, lanjut di matching
            result.clear();
            int maxIterable = Integer.min(source.length(), pattern.length());
            for (int i = 0; i < maxIterable ; i++) {
                if (source.charAt(i) == pattern.charAt(i) || pattern.charAt(i) == '*'){
                    result.add(i);
                } else {
                    break;
                }
            }
            if (result.size() == pattern.length()){
                return result;
            }
            return null;
        }
    }
}
