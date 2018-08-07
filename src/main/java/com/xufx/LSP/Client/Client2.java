package com.xufx.LSP.Client;

import com.xufx.LSP.Impl.Son;

import java.util.HashMap;
import java.util.Map;

public class Client2 {
    public static void main(String[] args) {
        //父类存在的地方，子类应该可以存在
        //Father father = new Father();
        Son father = new Son();
        HashMap map = new HashMap();
        father.doSomething(map);
    }
}
