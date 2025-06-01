package second.scr;

import second.scr.sun.ResNumber;

public class Main {

  public static void main(String[] args) {
    int arr[] = {-2000,0,-10,3,3,6,0,0,8};
    System.err.println("result metod first "+Integer.toString(ResNumber.CountEvens(arr)));
    System.err.println("result metod second "+Integer.toString(ResNumber.DifferenceArr(arr)));
    System.err.println("result metod second "+ResNumber.ZeroZero(arr));
  }
}
