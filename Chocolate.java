//calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
//Money: Total money one has to spend.
//Price: price per chocolate.
//wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
//Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
//example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14


import java.util.*;
public class Chocolate {
    public static void main(String[] args) {
      int money=40,price=1,wrapper=3,choco=1,visit=1;
      countChocoAndWrapper(money,price,wrapper,choco,visit);
    }
    public static void countChocoAndWrapper(int money,int price,int wrapperNeed, int choco, int visit){
        int chocolates=money/price;
        int wrappers=chocolates;
        int visitcount=0;
        while((visit >  visitcount)&& wrappers >= wrapperNeed){
            int exchange=(wrappers/wrapperNeed)*choco;
            wrappers=(wrappers%wrappers)+exchange;
            chocolates+=exchange;
            visitcount++;
        }
        System.out.println("Total chocolates can eat: " + chocolates);
        System.out.println("Wrappers left in hand: " + wrappers);
    }
}
