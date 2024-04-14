package HW_JDK_03.task_03;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
типа.
 */
public class CompareArray {
    public static <T> boolean compareArrays(T[] arrayA, T[] arrayB){
        if (arrayA == null || arrayB == null ||
            !arrayA[0].getClass().equals(arrayB[0].getClass()) ||
            arrayA.length != arrayB.length)  return false;
        else {
            for (int i = 0; i < arrayA.length; i++) {
                if ( arrayA[i] != arrayB[i] || !arrayA[i].equals(arrayB[i])){
                    return false;
                }
            }
        }
        return true;
    }
}
