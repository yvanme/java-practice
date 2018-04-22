# 枚举
enum内置了许多方法，常用的如下：
int compareTo(E o) 
          比较此枚举与指定对象的顺序。


Class<E> getDeclaringClass() 
          返回与此枚举常量的枚举类型相对应的 Class 对象。


String name() 
          返回此枚举常量的名称，在其枚举声明中对其进行声明。


int ordinal() 
          返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。


String toString()
           返回枚举常量的名称，它包含在声明中。


static <T extends Enum<T>> T valueOf(Class<T> enumType, String name) 
          返回带指定名称的指定枚举类型的枚举常量。


static T[] values()

返回该枚举的所有值。