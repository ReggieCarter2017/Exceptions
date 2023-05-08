package org.example;

public class Main {
    public static void main(String[] args) {
        Exceptions c = new Exceptions();

        c.nullPointerException();
        c.classCastException();
        c.arrayIndexOutOfBoundsException();


        Integer[] test = {1, 2, 3, 4, 7};
        Integer[] test1 = {4, 25, 3, 4};
        c.Print(c.sumOfArrays(test1, test));
    }
}


class Exceptions {
    public void classCastException() // Первое задание
    {
        try {
            Object n = new String("123");
            System.out.println((Integer) n);
        } catch (ClassCastException a) {
            System.out.println("Error! ClassCastException");
        }
    }

    public void arrayIndexOutOfBoundsException() // Второе задание
    {
        String[] list = new String[3];
        String a = "123";
        try {
            list[4] = a;
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println("Error! ArrayIndexOutOfBoundsException");
        }
    }

    public void nullPointerException() // Третье задагние
    {
        String d = null;
        try {
            System.out.println(d.length());
        } catch (NullPointerException b) {
            System.out.println("Error! NullPointerException");
        }
    }

    public Integer[] sumOfArrays(Integer[] a, Integer[] b) // Четвертое задание
    {
        Integer[] result = new Integer[a.length];

            if (a.length != b.length) throw new RuntimeException("Error!");
            else {
                for (int i = 0; i < a.length; i++) {
                    result[i] = a[i] - b[i];
                }
            }
            return result;

    }

    public void Print(Integer[] a)
    {
        for (Integer c : a) System.out.println(c);
    }
}