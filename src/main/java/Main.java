import java.util.HashMap;
import java.util.Scanner;


    public class Main {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);

            HashMap<Character, String> map = new HashMap<Character, String>();
            map.put('a', "2");
            map.put('b', "22");
            map.put('c', "222");
            map.put('d', "3");
            map.put('e', "33");
            map.put('f', "333");
            map.put('g', "4");
            map.put('h', "44");
            map.put('i', "444");
            map.put('j', "5");
            map.put('k', "55");
            map.put('l', "555");
            map.put('m', "6");
            map.put('n', "66");
            map.put('o', "666");
            map.put('p', "7");
            map.put('q', "77");
            map.put('r', "777");
            map.put('s', "7777");
            map.put('t', "8");
            map.put('u', "88");
            map.put('v', "888");
            map.put('w', "9");
            map.put('x', "99");
            map.put('y', "999");
            map.put('z', "9999");
            map.put(' ', "0");

            int n = in.nextInt();
            in.nextLine();
            for (int i = 0; i < n; i++) {
                String answer = "";
                String s = in.nextLine();
                for(int j = 0; j < s.length(); j++) {
                    String current = map.get(s.charAt(j));
                    if (answer.length() > 0 && answer.charAt(answer.length()-1) == current.charAt(0))
                        answer = answer + " " + current;
                    else
                        answer = answer + current;
                }
                System.out.println(answer);
            }

        }
    }

