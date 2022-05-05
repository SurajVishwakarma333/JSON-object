# JSON object


A JSON object contains key/value pairs like map. The keys are strings and the values are the JSON types. Keys and values are separated by comma.
The { }(curly brace) represents the json object and The [ ](square bracket) represents the json array.









            {
            "employee":
                 {
                  "name":  sachin,
                "salary":  56000,
                "status":  married
                }
            }        
            
            
            
            
            
            
            
            
MainActivity.java file            
            
            
            
            
            
            
            
            
            
            
            
            
            
           

      import androidx.appcompat.app.AppCompatActivity;

      import org.json.JSONObject;
      import android.os.Bundle;
      import android.widget.TextView;

      public class MainActivity extends AppCompatActivity {

      TextView textView1;

      public static final String JSON_STRING = "{\"employee\":{\"name\":\"Sachin\",\"salary\":56000,\"status\":married}}";

      @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView1 =  findViewById(R.id.textView1);

               try {
                        JSONObject emp = (new JSONObject(JSON_STRING)).getJSONObject("employee");
                        String empname = emp.getString("name");
                        int empsalary = emp.getInt("salary");
                        String empstatus= emp.getString("status");

        String str = "Employee Name:" + empname + "\n\n" + "Employee Salary:" + empsalary + "\n\n" + "Employee Status:" + empstatus;
        textView1.setText(str);

                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                      }
                   }
            
            
            
            
            
            
            
            
            
.xml file     










                        <?xml version="1.0" encoding="utf-8"?>
                        <RelativeLayout
                        xmlns:android="http://schemas.android.com/apk/res/android"
                        xmlns:app="http://schemas.android.com/apk/res-auto"
                        xmlns:tools="http://schemas.android.com/tools"
                        android:layout_width="match_parent"
                        android:layout_height="match_parent"
                        tools:context=".MainActivity">

                        <TextView
                        android:id="@+id/textView1"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_alignParentLeft="true"
                        android:layout_alignParentTop="true"
                        android:layout_marginLeft="118dp"
                        android:layout_marginTop="247dp"
                        android:text="TextView"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintHorizontal_bias="0.5"
                        app:layout_constraintStart_toStartOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />

                        </RelativeLayout>
 
            
            
            
            
            
            
            
            
            
            
            
![tttttttttttttt](https://user-images.githubusercontent.com/101108540/166904252-fc3c41cb-aaa6-4286-abe1-012d88b45732.jpg)

            

