package Hw7_16;

public class sorting{
	  public static void main(String[] args) {
		    int m[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		    sort(m);//呼叫排序程式

		    printArray(m); //呼叫列印程式
		  }
	  //排序程式
	  public static void sort(int m[][]) {
		    for (int i = 0; i < m.length; i++) {
		      double currentMin = m[i][0];
		      int currentMinIndex = i;

		      for (int j = i; j < m.length; j++) {
		        if (currentMin > m[j][0]|| (currentMin == m[j][0] && m[currentMinIndex][1] > m[j][1]))
		                                                                           
		        {
		          currentMin = m[j][0];
		          currentMinIndex = j;
		        }
		      }

		      // 互換 list[i] 和 list[currentMinIndex] 的值;
		      if (currentMinIndex != i) {
		        int temp0 = m[currentMinIndex][0];
		        int temp1 = m[currentMinIndex][1];
		        m[currentMinIndex][0] = m[i][0];
		        m[currentMinIndex][1] = m[i][1];
		        m[i][0] = temp0;
		        m[i][1] = temp1;
		      }
		    }
		  }
	  		// 將排序好的array列印出來;
		  public static void printArray(int m[][]) {
		    for (int i = 0; i < m.length; i++) {
		      System.out.println(m[i][0] + ", " + m[i][1]);
		    }
		  }

		}
