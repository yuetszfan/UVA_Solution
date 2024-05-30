package datastructure;

import java.util.*;
import java.io.*;

public class 11417_Gcd {

  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String line;
    while (true){
      line = buf.readLine();
      if (line.equals("0")) break;
      int N = Integer.parseInt(line);
      int G = 0;
      for (int i =1;i<N;i++){
        for (int j=i+1;j<=N;j++){
          G+=gcd(i,j);
        }
      }
      System.out.println(G);
    }
    buf.close();
    System.exit(0);
  }

    static int gcd(int i,int j){
      if (j==0) return i;
      return gcd(j,i%j);
    }

  
}
