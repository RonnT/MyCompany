package com.ron.mycompany;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "myDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // создаем таблицу с полями
        db.execSQL("CREATE TABLE companies ("
            + "id integer primary key autoincrement,"
            + "company text,"
            + "department text"
            + ");");
        db.execSQL("INSERT INTO companies (company, department) "
            + "VALUES ('ОАО Металлург', 'Отдел АХО'),"
            + "('ОАО Металлург', 'Отдел ИТ'),"
            + "('ОАО Металлург', 'Отдел снабжения'),"
            + "('ОАО Металлург', 'Отдел логистики'),"
            + "('ООО Колорист', 'Отдел ИТ'),"
            + "('ООО Колорист', 'Отдел продаж'),"
            + "('ООО Колорист', 'Отдел логистики'),"
            + "('ЗАО Манибанк', 'Отдел ИТ'),"
            + "('ЗАО Манибанк', 'Отдел АХО'),"
            + "('ЗАО Манибанк', 'Call-центр');");

        db.execSQL("CREATE TABLE departments ("
            + "id integer primary key autoincrement,"
            + "department text,"
            + "description text"
            + ");");

        db.execSQL("INSERT INTO departments (department, description) "
            + "VALUES ('Отдел продаж', 'Продажа товаров'),"
            + "('Отдел АХО', 'Административно-хозяйственная деятельность'),"
            + "('Отдел ИТ', 'Информационно-техническое обеспечение'),"
            + "('Отдел логистики', 'Разработка логистических схем'),"
            + "('Отдел снабжения', 'Снабжение предприятия'),"
            + "('Call-центр', 'Обработка входящих и исходящих звонков');");

        db.execSQL("CREATE TABLE news ("
            + "id integer primary key autoincrement,"
            + "headerNews text,"
            + "fullNews text"
            + ");");

        db.execSQL("INSERT INTO news (headerNews, fullNews) "
            + "VALUES ('Новость 1','Описание новости 1'),"
            + "('Новость 2','Описание новости 2'),"
            + "('Новость 3','Описание новости 3'),"
            + "('Новость 4','Описание новости 4'),"
            + "('Новость 5','Описание новости 5');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}