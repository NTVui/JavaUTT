/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dictionary;

import java.util.ArrayList;

/**
 *
 * @author soide
 */
public class Dictionary {

    static ArrayList<Word> arr = new ArrayList<>();
    
    static{
    arr.add(new Word(0, "Hello", "Xin chao"));
    arr.add(new Word(1, "Banana", "Quả chuối"));
    arr.add(new Word(2, "Cat", "Con mèo"));
    arr.add(new Word(3, "Dog", "Con chó"));
    arr.add(new Word(4, "Elephant", "Con voi"));
    arr.add(new Word(5, "Fish", "Con cá"));
    arr.add(new Word(6, "Grape", "Quả nho"));
    arr.add(new Word(7, "House", "Ngôi nhà"));
    arr.add(new Word(8, "Ice Cream", "Kem"));
    arr.add(new Word(9, "Jacket", "Áo khoác"));
    
}
}
