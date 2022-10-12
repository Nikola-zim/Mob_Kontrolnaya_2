package com.example.task_2;

import android.text.Editable;

public class Visitor {
    String full_name;
    Integer age;
    String time;
    String e_mail;

    // Конструктор класса
    public Visitor(String full_name, Integer age, String time, String e_mail){

        this.full_name = full_name;
        this.age = age;
        this.time = time;
        this.e_mail = e_mail;
    }

    public String getVisitor(){
        String res = "ФИО: " + this.full_name + " Возраст: " + this.age + " Время: " + this.time + " Почта: " + this.e_mail;
        return res;
    }
}
