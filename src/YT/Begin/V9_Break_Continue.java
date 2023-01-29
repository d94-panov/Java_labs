package YT.Begin;

public class V9_Break_Continue {
    public static void main(String[] args) {
        for(int i =0; i<=15; i++){
            if(i%2==0){  // % это остаток от деления
                continue;
            }
            System.out.println("Это нечетное число "+i);
        }
    }
}


// int i = 0;
//        while (true){
//            if(i==15){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Мы вышли из цикла");