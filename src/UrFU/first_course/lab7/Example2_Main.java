package UrFU.first_course.lab7;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
//базовом классе должен быть метод для присваивания значения полю: без параметров и с
//одним текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Доступное только для чтения свойство результатом возвращает
//длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
//дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).

public class Example2_Main {
    public static void main(String[] args) {
        Example2_superClassTest myTest0 = new Example2_subClassTest();
        String superClassTest0 = myTest0.toString();
        System.out.println(superClassTest0);

        Example2_superClassTest myTest1 = new Example2_superClassTest("test this");
        String superClassTest1 = myTest1.toString();
        System.out.println(superClassTest1);

        Example2_superClassTest myTest2 = new Example2_subClassTest();
        String superClassTest2 = myTest2.toString();
        System.out.println(superClassTest2);

        Example2_superClassTest myTest3 = new Example2_subClassTest("test this too");
        String subClassTest1 = myTest3.toString();
        System.out.println(subClassTest1);

        Example2_superClassTest myTest4 = new Example2_subClassTest(256);
        String subClassTest2 = myTest4.toString();
        System.out.println(subClassTest2);

        Example2_superClassTest myTest5 = new Example2_subClassTest("test this and this", 256);
        String subClassTest3 = myTest5.toString();
        System.out.println(subClassTest3);
    }
}
