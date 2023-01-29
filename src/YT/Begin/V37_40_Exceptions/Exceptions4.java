package YT.Begin.V37_40_Exceptions;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) { // может быть несколько catch блоков
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException { // метод может выбрасывать сколько угодно исключений

    }
}
