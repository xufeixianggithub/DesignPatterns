package com.xufx.LSP.Client;

import com.xufx.LSP.Impl.AUG;
import com.xufx.LSP.Impl.Rifle;
import com.xufx.LSP.Impl.Snipper;

public class Client {
   public static void main(String[] args) {
      test2();
   }

   static void test1() {
      Snipper snipper = new Snipper();
      snipper.killEnemy(new AUG());
   }

    static  void test2() {
      Snipper snipper = new Snipper();
      snipper.killEnemy((AUG) (new Rifle()));
   }
}