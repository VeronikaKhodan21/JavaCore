## HomeWork №2
* _все методы в файле [ResNumber](https://github.com/VeronikaKhodan21/JavaCore/tree/main/second/scr/sun/ResNumber.java)_
1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0 
```
    public static int CountEvens(int[] a){
        int res = 0;
      for (int i = 0; i < a.length; i++) {
          if (a[i]%2==0) {
            res = res+1;
          }
      }
      return res;
    }
```


2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
``` 
 public static int DifferenceArr(int[]a){
        int max =a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];
        }if(a[i]< min){
            min = a[i];
        }}
        return max - min;}

````

3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
```
public static Boolean ZeroZero(int[] a) {
        Boolean res = false;
        for (int i = 1; i < a.length; i++) {
            if(a[i]== 0 & a[i-1]== 0){
                res = true;
            }
        }
        return res;
    }
```