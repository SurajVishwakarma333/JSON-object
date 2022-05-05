package com.example.jsonobject;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;

    /*json object:-

    A JSON object contains key/value pairs like map. The keys are strings and the values are the JSON types. Keys and values are separated by comma.
    The { }(curly brace) represents the json object and The [ ](square bracket) represents the json array.

           {
            "employee":
                 {
                  "name":  sachin,
                "salary":  56000,
                "status":  married
                }
            }               */

        public static final String JSON_STRING = "{\"employee\":{\"name\":\"Sachin\",\"salary\":56000,\"status\":married}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            textView1 =  findViewById(R.id.textView1);

        try {
            JSONObject emp = (new JSONObject(JSON_STRING)).getJSONObject("employee");
            String empname = emp.getString("name");
            int    empsalary = emp.getInt("salary");
            String empstatus= emp.getString("status");

            String str = "Employee Name:" + empname + "\n\n" + "Employee Salary:" + empsalary + "\n\n" + "Employee Status:" + empstatus;
            textView1.setText(str);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}