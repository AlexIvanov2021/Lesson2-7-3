package com.example.lesson2_7_3;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final int version = 1;
    public static final String dbName ="Company.bd";
    public static final String TABLE_NAME ="Empdate";
    public static final String COL1 = "id";
    public static final String COL2 = "name";
    public static final String COL3 = "post";
    public static final String COL4 = "salary";

    private static final  String CREATE_TABLE = "create table if not exists "+TABLE_NAME + "("+COL1
            +"INTEGER PRIMARY KEY AUTOINCREMENT, "+ COL2 +"TEXT NOT NULL,"+ COL3 +"TEXT, "+ COL4 + "INTEGER);";
    private static final  String DROP_TABLE ="DROP TABLE IF EXISTS "+ TABLE_NAME;

    private Context context;

    public  DataBaseHelper(Context context){
        super(context,dbName,null,version);
        context = this.context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }catch (Exception E){

        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(DROP_TABLE);
        onCreate(sqLiteDatabase);
    }
    public boolean InsertEmployee(Employee objEmp){
        SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL2, objEmp.getEmployeeName());
        cv.put(COL3, objEmp.getEmployeePost());
        cv.put(COL4, objEmp.getEmployeeSalary());


        Long result =sqLiteDatabase.insert(TABLE_NAME,null,cv);
        if(result==-1)
            return  false;
        else
            return  true;

    }
}
