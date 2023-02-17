package com.example.helloworld.prac25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac25 extends AppCompatActivity {

    public static final String DATABASE_NAME = "myemployeedatabase";
    SQLiteDatabase mDatabase;
    EditText empname, empsal, empdept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac25);

        empname = (EditText) findViewById(R.id.datbase_emp_name);
        empsal = (EditText) findViewById(R.id.datbase_emp_salary);
        empdept = (EditText) findViewById(R.id.datbase_emp_department);

        findViewById(R.id.datbase_emp_add_btn_25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = empname.getText().toString().trim();
                String salary = empsal.getText().toString().trim();
                String dept = empdept.getText().toString().trim();
                if (name.isEmpty()) {
                    empname.setError("Please enter a name");
                    empname.requestFocus();

                } else if (salary.isEmpty() || Integer.parseInt(salary) <= 0) {
                    empsal.setError("Please enter salary");
                    empsal.requestFocus();

                } else if (dept.isEmpty()) {
                    empname.setError("Please enter Department");
                    empname.requestFocus();
                } else {
                    String insertSQL = "INSERT INTO employee \n" +
                            "(name, department, salary)\n" +
                            "VALUES \n" +
                            "(?, ?, ?);";
                    mDatabase.execSQL(insertSQL, new String[]{name, dept, salary});
                    Toast.makeText(prac25.this, "Employee Added Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.datbase_emp_viewemp_25).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(prac25.this, prac25_list.class));
            }
        });
        mDatabase = this.openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
        createEmployeeTable();
    }

    private void createEmployeeTable() {
        mDatabase.execSQL(
                "CREATE TABLE IF NOT EXISTS employee (\n" +
                        "    id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                        "    name varchar(200) NOT NULL,\n" +
                        "    department varchar(200) NOT NULL,\n" +
                        "    salary double NOT NULL\n" +
                        ");"
        );
    }
}
