Домашняя работа к семинарам по JDK  
Егерев Андрей гр. 6413  
#### Добавлено ДЗ к семинару 2  
- Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса  
Задание семинара
- Описать команду разработчиков. В команде разработчиков могут находиться бэкендеры,
которые в состоянии писать серверный код, фронтендеры,
которые могут программировать экранные формы, и фуллстэк разработчики, совмещающие в себе обе компетенции.
Реализовать класс фулстэк разработчика, создать экземпляр и последовательно вызвать
все его методы.  
#### Добавлено ДЗ к семинару 4
- Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник
  должен иметь следующие атрибуты:  
  Табельный номер
  Номер телефона
  Имя
  Стаж
  - Добавить метод, который ищет сотрудника по стажу (может быть список)
  - Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
  - Добавить метод, который ищет сотрудника по табельному номеру
  - Добавить метод добавление нового сотрудника в справочник сотрудников  
#### Добавлено ДЗ к семинару 3
- Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
- Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два
числа разного типа, над которыми должна быть произведена операция.
- Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
типа.
- Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
Класс должен иметь методы getFirst(), getSecond() для получения значений
пары, а также переопределение метода toString(), возвращающее строковое представление пары.
#### Добавлено ДЗ к семинару 5
В качестве задачи предлагается решить классическую задачу про обедающих философов
Условие:
 - Есть пять философов (потоки), которые могут либо обедать (выполнение кода) либо размышлять (ожидание).
 - Каждый философ должен пообедать три раза. Каждый прием пищи длиться 500 миллисекунд
 - После каждого приема пищи философ должен размышлять
 - Не должно возникнуть общей блокировки
 - Философы не должны есть больше одного раза подряд