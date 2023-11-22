import java.util.*;

class SnakeAndLadder{
    public static void main(String[] arg){
      int pos=0, num_of_times=0;
      Random random = new Random();
      while(pos!=100){
           int dice_num=random.nextInt(6)+1;
           int options=random.nextInt(3);
           switch(options){
            case 0: //no play
            break;
             case 1: //ladder
               if(pos+dice_num<=100)
                  pos+=dice_num;
             break;
             default: //snake
              pos-=dice_num;
              if(pos<0)
              pos=0;
           }
           num_of_times++;
           System.out.println("Position at dice roll "+num_of_times+" is:"+pos);
      }
      System.out.println("Total dices played: "+num_of_times);
    }
}