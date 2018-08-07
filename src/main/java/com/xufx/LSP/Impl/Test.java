package com.xufx.LSP.Impl;

public class Test extends Parent {



    public static void main(String[] args) {
        System.out.println("haha");
        Test t = new Test();
        t.t2(3);
        //这种情况下，区分重写（覆盖）的区别。覆盖调用子类的方法，重载只调用父类的方法
        Parent t3 = (Parent) t;
        t3.t2(3);
        

    }

    public void t2(int a) {
        System.out.println("子类t2的int a==" + a);
    }

}