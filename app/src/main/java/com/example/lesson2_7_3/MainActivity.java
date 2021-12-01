package com.example.lesson2_7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextPost = findViewById(R.id.edTextPost);
        EditText editTextSalary = findViewById(R.id.edTextSalary);
        Button buttonSave = findViewById(R.id.buttonSave);

        DataBaseHelper dbh= new DataBaseHelper(getApplicationContext());
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee objEmp = new Employee(editTextName.getText().toString(), editTextPost.getText().toString(),Integer.parseInt(editTextSalary.getText().toString()));
                if(dbh.InsertEmployee(objEmp))
                    Toast.makeText(getApplicationContext(),"Record inserted successfuly ",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Record  not inserted  ",Toast.LENGTH_LONG).show();
            }
        });
    }
}

