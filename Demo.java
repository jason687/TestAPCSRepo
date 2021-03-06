public class Demo {
  public static void main (String[] args) {
//    int [] arr1 = {1, 2, 3};
//    int [] arr2 = {2, 3, 4, 5};
//    int [] arr3 = {3, 4, 5, 6, 7};
//    int [] arr4 = {4, 5, 6, 7, 8, 9};
//    int [] arr5 = {5, 6, 7, 8, 9, 10};
//    int [][] arrBig = {arr1, arr2, arr3, arr4, arr5};
    if (args.length == 0) {
      printLoop(5);
    } else {
      printLoop(Integer.parseInt(args[0]));
    }
//    System.out.println(arrayDeepToString(create2DArrayRandomized(5, 4, 4)).replace("}, ", "},\n "));
  }

  public static void printLoop (int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; (j + i - 1) <= n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrayDeepToString (int [][] arr) {
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      str = str + "{";
      for (int j = 0; j < arr[i].length; j++) {
        if (j == 0) {
          str = str + arr[i][0];
          j += 1;
        } else {
          str = str + ", " + arr[i][j];
        }
      }
      if (i == arr.length - 1) {
        str = str + "}}";
      } else {
      str = str + "}, ";
    }
  }
//    String str1 = "";
//    String str2 = "";
//    String str3 = "";
//    String str4 = "";
//    String str5 = "";
//    str1 = arrToString(arr[0]);
//    str2 = arrToString(arr[1]);
//    str3 = arrToString(arr[2]);
//    str4 = arrToString(arr[3]);
//    str5 = arrToString(arr[4]);
//    return "{" + str1 + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + "}";
    return str;
  }

  public static String arrToString(int [] arr) {
    String str = "{";
    if (arr.length == 0) {
      return "{}";
    }
    str = str + arr[0];
    for (int i = 1; i < arr.length; i++) {
      str = str + ", " + arr[i];
    }
    return str + "}";
  }

  public static int [][] create2DArray (int rows, int cols, int maxValue) {
    int [][] array = new int [rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols - 1; j++) {
        array[i][j] = (int) (Math.random() * (maxValue + 1.0));
      }
    }
    return array;
  }

  public static int [][] create2DArrayRandomized (int rows, int cols, int maxValue) {
    int tempCols = 0;
    cols += 1;
    tempCols = (int)(Math.random() * (cols + 1));
    int [] arrTemp = new int [tempCols];
    int [][] array = new int [rows][];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < tempCols; j++) {
        arrTemp[j] = (int) (Math.random() * (maxValue + 1.0));
      }
      array[i] = arrTemp;
      tempCols = (int)(Math.random() * (cols + 1));
      arrTemp = new int [tempCols];
    }
    return array;
  }
}
