package com.nibm.meetup.collection;

import java.util.List;
import java.util.ArrayList;

public class O5_EnhancedForImmutable
{
  public static void main(String[] args)
  {
    List<String> lst = new ArrayList<String>();
    lst.add("alpha");
    lst.add("beta");
    lst.add("charlie");
    System.out.println(lst); // [alpha, beta, charlie]

    for (String str : lst)
    {
      str += "change!"; // cannot modify "immutable" objects
    }
    System.out.println(lst); // [alpha, beta, charlie]
  }
}