package lipeilin.xipai;

import java.util.*;

/**
 * @version: java version 1.8
 * @Author: LiPeiLin
 * @description:
 * @date: 2023-09-01 10:41
 */
public class Room {
    private List<Card> allCards = new ArrayList<>();
    public Room() {
        //创建房间的时候，就创建一副牌
        //做出53张牌，存到集合allCards中
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[] colors = {"♠","♥","♣","♦"};
        //遍历点数，再遍历花色，组装成牌
        int size = 0;
        for(String number : numbers){
            size++;
            for(String color : colors){
                //创建牌对象
                Card c = new Card(number,color,size);
                //添加到集合中
                allCards.add(c);
            }
        }
        //最后加入大小王
        Card c1 = new Card("","小王",++size);
        Card c2 = new Card("","大王",++size);
        Collections.addAll(allCards,c1,c2);
        System.out.println("洗牌前"+allCards);
    }

    /*游戏启动*/
    public void start() {
        Collections.shuffle(allCards);
        System.out.println("洗牌后"+allCards);
        //发牌
        //创建三个玩家,发出51张牌，3张留作底牌
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> dipai = new ArrayList<>();
        for(int i = 0;i < allCards.size();i++){
            Card c = allCards.get(i);
            if(i >= allCards.size()-3){
                //留作底牌
                dipai.add(c);
            }else if(i % 3 == 0){
                player1.add(c);
            }else if(i % 3 == 1){
                player2.add(c);
            }else if(i % 3 == 2){
                player3.add(c);
            }
        }
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        //看牌
        System.out.println("玩家1："+player1);
        System.out.println("玩家2："+player2);
        System.out.println("玩家3："+player3);
        System.out.println("底牌："+dipai);
        //排序
    }
    //对牌进行排序的方法
    private void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getSize() - o1.getSize();//降序排序
            }
    });
    }
}
