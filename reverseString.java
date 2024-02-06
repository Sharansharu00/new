import java.util.Scanner;

public class reverseString {
  public static void main(String[]args){
    String str="Sharan";
    String rev="";
    for(int i=0;i<str.length();i++){
        rev=str.charAt(i)+rev;
        
        }System.out.println(rev);
        System.out.println(rev+"reverse");
    }
}
