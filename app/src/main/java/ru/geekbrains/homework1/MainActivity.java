package ru.geekbrains.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
//    2. Создать ещё один макет (если не получается, то проект) с несколькими EditText,
//    где использовать атрибут inputType: text, textPersonName, phone, number, textPassword, textEmailAddress и другие значения.
//3. Добавить в проект элемент CalendarView.
    private EditText editTextTextPersonName4;
    private EditText editTextTextPersonName5;
    private EditText editTextTextEmailAddress;
    private EditText editTextPhone;
    private EditText editTextTextPassword;
    private CalendarView calendarView;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName4 = findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        calendarView = findViewById(R.id.calendarView);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Person person1 = new Person(editTextTextPersonName4.getText().toString(),editTextTextPersonName5.getText().toString(),editTextTextEmailAddress.getText().toString(), editTextPhone.getText().toString(),editTextTextPassword.getText().toString(),calendarView.getDate());//не понял как правильн получить дату ):



            Toast toast = Toast.makeText(this, "name: " +person1.name + " " + "lastname: "+ person1.lastName+" ",Toast.LENGTH_LONG);

            toast.show();

        });



    }


    }
