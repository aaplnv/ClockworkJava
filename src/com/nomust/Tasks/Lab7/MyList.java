package com.nomust.Tasks.Lab7;

import java.util.Arrays;
import java.util.Comparator;

public class MyList <T>{
    private T[] arr;
    private int count;
    private int size;

    public MyList(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
        count = 0;
    }

    public MyList(MyList<T> other){
        this.count = other.count;
        this.size = other.size;
        this.arr = (T[]) new Object[size];
        System.arraycopy(other.arr, 0, arr, 0, count);
    }

    public void add(T newitem){
        if(size - count == 1) resize(size*2);
        arr[count++] = newitem;
    }
    public void add(T newitem, int index){
        if(size - count == 1) resize(size*2);
        System.arraycopy(arr, index, arr, index+1, count-index);
        arr[index] = newitem;
    }
    public boolean addAll(int index, MyList<T> other){
        if(other.count == 0) return false;

        int newSize = size;
        while (newSize - count <= other.count) newSize *= 2;
        resize(newSize);
        System.arraycopy(arr, index, arr, index+other.count, count - index);
        System.arraycopy(other.arr, 0, arr, index, other.count);
        count += other.count;

        return true;
    }

    public int indexOf(T o){
        for(int i = 0; i < count; i++)
            if(arr[i].equals(o)) return i;
        return -1;
    }

    public int lastIndexOf(T o){
        for(int i = count-1; i >=0; i--)
            if(arr[i].equals(o)) return i;
        return -1;
    }

    public void sort(Comparator<? super T> comp){
        Arrays.sort(arr, comp); // java.lang.NullPointerException
    }

    public MyList<T> subList(int start, int end){
        MyList<T> nl = new MyList<T>(end);
        for(int i = start; i<end; i++) nl.add(arr[i]);
        return nl;
    }

    public void set(int index, T o){
        arr[index] = o;
    }

    public T remove(int index){
        if(index > count)
            throw new IndexOutOfBoundsException();
        T o = arr[index];
        System.arraycopy(arr, index+1, arr, index, count-index-1);
        arr[--count] = null;

        if(count < size/2) resize(size/2);
        return o;
    }


    private void resize(int newsize){
        if(newsize > size)
            arr = Arrays.copyOf(arr, newsize);
        else{
            T[] temp = (T[])new Object[newsize];
            System.arraycopy(arr, 0, temp, 0, newsize);
            arr = temp;
        }
        size = newsize;

    }

    public T get(int index){
        if(index > count)
            throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "l=" + Arrays.toString(arr) +
                ", count=" + count +
                ", size=" + size +
                '}';
    }
}