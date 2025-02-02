package myapplication;

class reverstring {
    public String reverse(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }

}

class divide {

    public int values(int a, int b) {
        return a / b;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
    }
}
