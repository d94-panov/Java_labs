package YT.Begin.V48_Enum;

public enum Animal {
    DOG("собака"), CAT("кот"), FROG("лягушка");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
