package YT.Begin;

public class V6_If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt<10) {
            System.out.println("Да, верно");
        } else if(myInt>20){
            System.out.println("Нет, не верно");
        } else{
            System.out.println("Ни один из предыдущих случаев");
        }
    }
} // программа идет сверху вниз. если первое условие выполнено, то ко второму не перейдет
