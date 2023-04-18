/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ali.veysalov
 */
public class Main {
     public static void main (String args[]){
       Immutable obj = new Mutable();
       doIt(obj);
     }
     
     public Main(Immutable obj){//burada programmer elə bilir ki, ona gələn obyet
     //immutable-dır.Lakin biz Mutable classın obyektini göndərmişik.Məhz buna görə
     //İmmutable classın şərtləri arasında methodları override edilə bilməmə şərti var
      //do something here
     }
    
}
