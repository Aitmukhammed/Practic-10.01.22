package com.company;

public class Queue {
    char q[]; // Массив для хранения очереди
    int putloc, getloc; // Индексы для вставки и извлечения элементов очереди

    Queue(int size){
        q = new char[size]; //Выделение памяти для очереди
        putloc = getloc = 0;
    }
    void put(char ch){
        if(putloc==q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
     char get(){
        if (getloc == putloc){
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
     }
}
