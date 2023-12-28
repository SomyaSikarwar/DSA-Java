package SearchingAndSorting;
import java.util.Arrays;
import java.util.Stack;

public class StringManipilation {

    public void CountingVowels(String name){
        int count = 0;
        for(int i = 0 ; i < name.length() ; i++){
            if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'||name.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }

    //String reversal using Stacks
    public void StringReversal(String name){
        Stack<Character> stack2 = new Stack<>();
        String name1 = "";
        for(int i = 0 ; i < name.length(); i++){
            stack2.push(name.charAt(i));
        }
        for(int i = 0 ; i < name.length(); i++){
            name1 += stack2.pop();
        }
        System.out.println(name1);
     }

     //String reversal using iterative method
     public void StringReversal2(String name){
        String reverse = "";
        for(var i = name.length()-1 ; i >=0 ; i--){
            reverse += name.charAt(i);
        }
         System.out.println(reverse);
     }

     public void WordReversal(String name) {
         String[] words = name.split(" ");
//        for(String str : words){
//            System.out.println(str);
//        }
         for(int i = words.length -1 ; i >= 0 ; i-- ){
             System.out.print(words[i]+" ");
         }
         System.out.println();
     }
//On hold for a while
    /* public boolean Rotation(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        String string = str1 + str2;
        for(int i = 0 ; i < string.length() ;i++){
            if()
        }
        return true;
     }*/

    public boolean Palindrome(String str){
        int start = 0 ;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramUsingSorting(String str1 , String str2){
        var Array1 = str1.toCharArray();
        var Array2 = str2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        if(str1.length() != str2.length()){
            return false;
        }

        for (int i=0;i<str1.length();i++){
            if(Array1[i] != Array2[i]){
                return false;
            }
        }
        return true;

    }

}
