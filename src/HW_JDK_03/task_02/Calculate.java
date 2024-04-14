package HW_JDK_03.task_02;
/*
. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
 */
public class Calculate {

    public static <T extends Number, V extends Number> double sum(T number1, V number2){
        return number1.doubleValue() + number2.doubleValue();
    }
//    public static <T extends Number> T sum(T number1, T number2){
//        Double sum = number1.doubleValue() + number2.doubleValue();
//        return (T) sum;
//    }
    public static <T extends Number, V extends Number> double multiply(T number1, V number2) {
        return number1.doubleValue() * number2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T number1, V number2) throws ArithmeticException{
        if (number2.doubleValue() == 0) {
           throw new ArithmeticException("Divide by zero");
        }
        return number1.doubleValue() / number2.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtract(T number1, V number2) {
        return number1.doubleValue() - number2.doubleValue();
    }
}
