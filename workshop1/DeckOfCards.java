import java.io.*;
import java.util.*;

class DeckOfCards {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Random random=new Random();
String[] suits={"Clubs", "Diamonds", "Hearts", "Spades"};
String[] ranks={"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
String[][] player_cards=new String[5][2];
for(int i=1;i<=4;i++){
   int pos_of_suit=random.nextInt(suits.length);
   int pos_of_rank=random.nextInt(ranks.length);
  player_cards[i][0]=ranks[pos_of_rank];
  player_cards[i][1]=suits[pos_of_suit];
}
for(int i=1;i<=4;i++){
System.out.println("Player "+i+" receives "+player_cards[i][0]+" of "+ player_cards[i][1]);
}
}
}