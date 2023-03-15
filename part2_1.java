import java.util.*;
public class part2_1{
  public static String removeDup(String s){
    int n = s.length();
    int i=0; 
    String og = s;
    if(n<=1) return "";
    while(i<n){
      int j=i+1;
      n = s.length();
      while(j<n && s.charAt(i) == s.charAt(j)){
          j++;
      }
      if(j!=i+1){
        String t = "";
        if(j<n) t = s.substring(j);
        s = s.substring(0, i) + t;
        //System.out.println(s);
      }
      else{
        i++;
      }
    }
    if(og == s) return s;
    return removeDup(s);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String str = removeDup(s);
    if(str.isEmpty()) System.out.println("Empty String");
    else System.out.println(str);
  }
}
