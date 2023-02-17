package com.example.helloworld.prac25;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import com.example.helloworld.R;

import java.util.ArrayList;
import java.util.List;

public class prac25_list extends AppCompatActivity {

    List<Employee> employeeList;
    SQLiteDatabase mDatabase;
    ListView listViewEmployees;
    EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac25_list);

        listViewEmployees = findViewById(R.id.database_emp_list);
        employeeList = new ArrayList<>();
        mDatabase = openOrCreateDatabase(prac25.DATABASE_NAME, MODE_PRIVATE, null);
        showEmployeesFromDatabase();
    }

    private void showEmployeesFromDatabase() {
        Cursor cursorEmployees = mDatabase.rawQuery("SELECT * FROM employee", null);
        if (cursorEmployees.moveToFirst()) {
            do {
                employeeList.add(new Employee(
                        cursorEmployees.getInt(0),
                        cursorEmployees.getString(1),
                        cursorEmployees.getString(2),
                        cursorEmployees.getDouble(3)
                ));
            } while (cursorEmployees.moveToNext());
        }
        cursorEmployees.close();
        adapter = new EmployeeAdapter(prac25_list.this, R.layout.prac25_listview_layout, employeeList);
        listViewEmployees.setAdapter(adapter);
    }
}
