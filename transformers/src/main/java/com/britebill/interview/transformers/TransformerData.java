package com.britebill.interview.transformers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransformerData {
    public List<String> transformData (List<String> src) {
        Set<String> set = new HashSet<String>(src);
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        list.replaceAll(String::toUpperCase);
        return list;
    }
}
