package pl.piesniak.string;

import java.util.*;

public class NonRepeatingChar {
    public static Character nonRepeating(String s) {
        Set<Character> singles = new LinkedHashSet<>();
        Set<Character> polis = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (singles.contains(ch)) {
                singles.remove(ch);
                polis.add(ch);
            } else if (!polis.contains(ch)) {
                singles.add(ch);
            }
        }
        if (singles.size() == 0){
            return null;
        }
        return singles.iterator().next();
    }
}
