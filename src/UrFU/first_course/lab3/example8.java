package UrFU.first_course.lab3;

public class example8 {
    public static void main(String[] args) {
        int size = 10;
        char chars[] = new char[size];
        char i = 'A';
        char ExcludeChars[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int x = 0; x < chars.length; i++) {
            for (int y = 0; y < ExcludeChars.length; y++) {
                if (i == ExcludeChars[y]) {
                    i++;
                }
            }
            chars[x] = i;
            System.out.println("" + chars[x]);
            x++;
        }
    }
}
