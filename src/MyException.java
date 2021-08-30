public
class MyException extends Exception {
    public
    MyException(String cause) {
        if (cause.equals("plural_operator"))
            System.err.println("не допустимое количество операторов");
        if (cause.equals("operator"))
            System.err.println("оператор отсутствует или не допустимый оператор");
        if (cause.equals("nan"))
            System.err.println("в выражение есть члены не являющиеся числами или числа не входящие в заданный диапазон");
        if (cause.equals("mix"))
            System.err.println("используются разные системы счисления");
        if (cause.equals("negative"))
            System.err.println("Результат работы калькулятора с римскими числами может быть только положительное число");
    }
}
