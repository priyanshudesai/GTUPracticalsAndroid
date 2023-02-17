package com.example.helloworld.prac25;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.helloworld.R;

import java.util.ArrayList;
import java.util.List;

import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;

public class EmployeeAdapter extends ArrayAdapter<Employee> {

    Context mCtx;
    int listLayoutRes;
    List<Employee> employeeList;
    SQLiteDatabase mDatabase;
    EmployeeAdapter adapter;

    EmployeeAdapter(Context mCtx, int listLayoutRes, List<Employee> employeeList) {
        super(mCtx, listLayoutRes, employeeList);

        this.mCtx = mCtx;
        this.listLayoutRes = listLayoutRes;
        this.employeeList = employeeList;
    }


    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(listLayoutRes, null);
        final Employee employee = employeeList.get(position);

        TextView textViewName = view.findViewById(R.id.db_list_name);
        TextView textViewDept = view.findViewById(R.id.db_list_dept);
        TextView textViewSalary = view.findViewById(R.id.db_list_sal);

        textViewName.setText(employee.getName());
        textViewDept.setText(employee.getDept());
        textViewSalary.setText(String.valueOf(employee.getSalary()));

        Button buttonDelete = view.findViewById(R.id.db_list_dlt_btn);
        Button buttonEdit = view.findViewById(R.id.db_list_edit_btn);

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase = mCtx.openOrCreateDatabase(prac25.DATABASE_NAME, Context.MODE_PRIVATE, null);

                final EditText en, ed, es;
                AlertDialog.Builder builder = new AlertDialog.Builder(mCtx);
                LayoutInflater inflater = (LayoutInflater) mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflater.inflate(R.layout.prac25_edit, null);
                builder.setView(v);
                builder.setCancelable(true);
                final AlertDialog alert = builder.create();
                en = v.findViewById(R.id.edit_emp_name);
                ed = v.findViewById(R.id.edit_emp_department);
                es = v.findViewById(R.id.edit_emp_salary);
                en.setText(employee.getName());
                ed.setText(employee.getDept());
                es.setText(employee.getSalary() + "");

                v.findViewById(R.id.edit_emp_edit_btn_25).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ContentValues args = new ContentValues();
                        args.put("name", en.getText() + "");
                        args.put("department", ed.getText() + "");
                        args.put("salary", Double.parseDouble(es.getText() + ""));
                        mDatabase.update("employee", args, "id=" + employee.getId(), null);

                        employeeList = new ArrayList<>();
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
                        notifyDataSetChanged();
                        alert.dismiss();
                    }
                });
                alert.show();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase = mCtx.openOrCreateDatabase(prac25.DATABASE_NAME, Context.MODE_PRIVATE, null);
                mDatabase.delete("employee", "id =" + employee.getId(), null);
                employeeList.remove(position);
                notifyDataSetChanged();
            }
        });
        return view;
    }
}
