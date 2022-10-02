package com.ysh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameMain {
    public static List<Card> cards = new ArrayList<>();
    static {
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"♥","♠","♦","♣"};

        //记录牌的大小
        int index = 0;

        //循环放入52张牌
        for (String num:number){
            index++;
            for (String cor:color){
                cards.add(new Card(num,cor,index));
            }
        }

        //大王小王单独放入，因为没有花色
        Card c1 = new Card("大王","",++index);
        Card c2 = new Card("小王","",++index);
        Collections.addAll(cards,c1,c2);
        System.out.println("新牌："+cards);
    }

    public static void main(String[] args) {
        //打乱新牌
        Collections.shuffle(cards);
        System.out.println("打乱后:"+cards);

        //创建三个集合模拟三个人拿牌
        List<Card> first = new ArrayList<>();
        List<Card> second = new ArrayList<>();
        List<Card> third = new ArrayList<>();
        for (int i = 0; i < cards.size()-3; i++) {
            if (i%3 == 0){
                first.add(cards.get(i));
            }else if (i%3 == 1){
                second.add(cards.get(i));
            }else {
                third.add(cards.get(i));
            }
        }

        //存放底牌
        List<Card> end = cards.subList((cards.size()-3),cards.size());

        //玩家顺牌（排序）
        sortCards(first);
        sortCards(second);
        sortCards(third);

        //输出三人拿到的牌 和底牌
        System.out.println("张三"+first);
        System.out.println("李四"+second);
        System.out.println("王五"+third);
        System.err.println("底牌"+end);


    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getIndex()-o1.getIndex();
            }
        });
    }
}
