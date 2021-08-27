package Poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //装牌
        ArrayList<String> array = new ArrayList<String>();
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);
        //创建玩家
        ArrayList<String> lqxArray = new ArrayList<String>();
        ArrayList<String> lyArray = new ArrayList<String>();
        ArrayList<String> wzxArray = new ArrayList<String>();
        //底牌
        ArrayList<String> dpArray = new ArrayList<String>();
        //发牌
        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                lqxArray.add(poker);
            } else if (i % 3 == 1) {
                lyArray.add(poker);
            } else if (i % 3 == 2) {
                wzxArray.add(poker);
            }
        }
        //看牌
        lookPoker("林青霞", lqxArray);
        lookPoker("柳岩", lyArray);
        lookPoker("王祖贤", wzxArray);
        lookPoker("底牌", dpArray);
        //System.out.println(array);
    }

    //看牌方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
