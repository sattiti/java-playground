public class Main{
  public static void main(String[] args){
    int[] score = {84, 32, 11, 35, 74, 34, 26, 56, 62, 49};
    int len     = score.length;

    for(int i = 0; i < len -1; i++) {
      for(int j = len -1; j > i; j--) {
        if(score[j -1] > score[j]) {
          int tmp     = score[j -1];
          score[j -1] = score[j];
          score[j]    = tmp;
        }
      }
      System.out.println(score[i]);
    }
  }
}

