public class Main {
    public static void main(String[] args) {
        /*
        Студент ИУ
         */
        IUStudent MaX = new IUStudent("Прозоров Максим Александрович", 1, 4); // Создание объекта определенного класса
        System.out.println(MaX.writeExam(4)); // Проверка работы метода
        System.out.println(MaX.LastExamMark); // Проверка изменения атрибутов после выполнения метода
        /*
        Студент Э
         */
        MathStudent MaX2 = new MathStudent("Швецов Леонид Алексеевич", 1, 3);
        System.out.println(MaX2.writeExam(5));// Аналогичные проверки
        System.out.println(MaX2.LastExamMark);
    }
}