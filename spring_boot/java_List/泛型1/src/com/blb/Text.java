package com.blb;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * @author smilecb
 * @date 2021/9/16 0016 10:42
 */
public class Text extends Order {
    public <E> List<E> copy(E[] arr)
    {
        ArrayList<E> list = new ArrayList<>();
        for(E e:arr)
        {
            list.add(e);
        }
        return list;
    }
}
