import java.util.Scanner;

/*In the given string find the longest word and output it.
* Input data:
*    Given a string in a single line.Words in the string
*     are separated by a single space.
* Output data:
    * Output the longest word.If there are several such words,
    * you should output the one, which occurs earlier.*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] strArr = str.split(" ");

        String maxWord = strArr[0];
        for(String initialWord : strArr){
            if(maxWord.length() < initialWord.length()){
                maxWord = initialWord;
            }
        }
        System.out.println(maxWord);
    }

}