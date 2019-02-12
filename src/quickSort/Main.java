public class Main{
  public static void main(String[] args){
    int[] target = {20, 53, 10, 40, 75, 466, 9402, 54, 3220, 56674, 46, 679, 457, 908};

    System.out.println("ソート前 :");
    for(int i = 0; i < target.length; i++) {
      System.out.println(target[i]);
    }

    Main m = new Main();
    m.quickSort(target, 0, target.length -1);

    System.out.println("\nソート後 :");
    for(int i = 0; i < target.length; i++) {
      System.out.println(target[i]);
    }
  }


  /**
   * 軸要素を見つける pivot
   * 順に見て、最初に見つかった異なる2つの要素のうち、
   * 大きいほうの番号を返します。
   * 全部同じ要素の場合は -1 を返します。
   *
   * @param  target
   * @param  i
   * @param  j
   * @return 
   */
  public int pivot(int[] target, int i, int j)
  {
    int k = i +1;
    while(k <= j && target[i] == target[k]) k++;
    if(k > j) return -1;
    if(target[i] >= target[k]) return i;
    return k;
  }

  /**
   * 軸要素を中心としてデータを2つに分割する（partition）
   *
   * @param  target
   * @param  i
   * @param  j
   * @param  x
   * @return 
   */
  public int partition(int[] target, int i, int j, int x)
  {
    int k = i;
    int e = j;

    // 検索が交差するまで繰り返します
    while(k <= e) {
      // 軸要素以上のデータを探します
      while(k <= j && target[k] < x) k++;
      // 軸要素未満のデータを探します
      while(e >= i && target[e] >= x) e--;

      if(k > e) break;
      int t = target[k];
      target[k] = target[e];
      target[e] = t;
      k++;
      e--;
    }
    return k;
  }


  /**
   *
   */
  public void quickSort(int[] target,int i,int j)
  {
    if(i == j) return;
    int p = pivot(target, i, j);

    if(p != -1){
      int k = partition(target, i, j, target[p]);
      quickSort(target, i, k -1);
      quickSort(target, k, j);
    }
  }
}
