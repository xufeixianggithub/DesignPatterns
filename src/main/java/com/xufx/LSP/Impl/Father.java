package com.xufx.LSP.Impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father{
  public Collection doSomething(HashMap map){
     System.out.println("父类被执行");
     return map.values();
  }
}