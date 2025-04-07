import java.util.ArrayList;
import java.util.Arrays;

public class SubseqString {
    //method define
    public static void  seq(char [] ch,int index,ArrayList<Character> al){
        if (index==ch.length) {
            if (al.size()>0) {
                System.out.println(al);
            }
            return ;
        }
        seq(ch, index+1, al);
        al.add(ch[index]);
        seq(ch, index+1, al);
        al.remove(al.size()-1);
    }
    public static void main(String[] args) {
        String str="ABC";
        char [] ch=str.toCharArray();

        System.out.println("The Subsequences for String "+str+" are ");
        seq(ch,0,new ArrayList<>());
    }
}
