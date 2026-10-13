package Programacion3.Semana7;

import java.util.ArrayList;
public class ListaArreglos
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(3);
        arr.add(1);
        arr.add(9);
        arr.add(6);
        arr.add(30);
        arr.add(8);
        arr.add(4);
        arr.add(2);
        System.out.println(arr.get(2)); //1
        System.out.println(arr.get(5)); //30
        System.out.println(arr.indexOf(6)); //4
        System.out.println(arr.indexOf(23)); //-1
    }
}