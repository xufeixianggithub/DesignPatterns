package com.xufx.LSP.Impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{

    @Override
  public Collection doSomething(HashMap map){
     System.out.println("子类被执行");
     return map.values();
  }
}