package com.ain_2_20_adis_kerimov.doctors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_call;
    String number = "996220075870";

    ArrayList<DoctorModel> doctors = new ArrayList<DoctorModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        DoctorAdapter adapter = new DoctorAdapter(this, doctors);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);



    }

    private void setInitialData(){

        doctors.add(new DoctorModel ("Айгерим Будайчиева", "Пол: Женский", "Возраст: 19", "Национальность: Кыргызка", "Должность: Хирург", "Стаж: 2 года", "Офис: Central Hospital", "Номер телефона: +996(554)648880", R.drawable.emma));
        doctors.add(new DoctorModel ("Даниил Жуков", "Пол: Мужской", "Возраст: 21", "Национальность: Русский", "Должность: Терапевт", "Стаж: 3 года", "Офис: Central Hospital", "Номер телефона: +996(700)331526", R.drawable.dva));
        doctors.add(new DoctorModel ("Ульяна Лебедева", "Пол: Женский", "Возраст: 28", "Национальность: Русская", "Должность: ЛОР", "Стаж: 2 года", "Офис: Central Hospital", "Номер телефона: +996(700)796225", R.drawable.ulyana));
        doctors.add(new DoctorModel ("Мазда Айдарбеков", "Пол: Мужской", "Возраст: 24", "Национальность: Кыргыз", "Должность: Психотерапевт", "Стаж: 1 год", "Офис: Central Hospital", "Номер телефона: + 996(700)362926", R.drawable.tri));
        doctors.add(new DoctorModel ("Жоомарт Жолдошев", "Пол: Мужской", "Возраст: 25", "Национальность: Кыргыз", "Должность: Психолог", "Стаж: 8 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)990903", R.drawable.pyat));
        doctors.add(new DoctorModel ("Святослав Попов", "Пол: Мужской", "Возраст: 32", "Национальность: Кыргыз", "Должность: Нейрохирург", "Стаж: 12 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)443941", R.drawable.popov));
        doctors.add(new DoctorModel ("Стефания Родионова", "Пол: Женский", "Возраст: 54", "Национальность: Русская", "Должность: Патологоанатом", "Стаж: 11 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)888326", R.drawable.vosem));
        doctors.add(new DoctorModel ("Ксения Демидова", "Пол: Женский", "Возраст: 56", "Национальность: Русская", "Должность: Уролог", "Стаж: 3 года", "Офис: Central Hospital", "Номер телефона: + 996(700)992158", R.drawable.shest));
        doctors.add(new DoctorModel ("Вадим Борисов", "Пол: Мужской", "Возраст: 31", "Национальность: Кыргыз", "Должность: Гинеколог", "Стаж: 6 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)413773", R.drawable.boris));
        doctors.add(new DoctorModel ("Виктория Сазонова", "Пол: Женский", "Возраст: 22", "Национальность: Кыргызка", "Должность: Педиатр", "Стаж: 5 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)990903", R.drawable.vika));
        doctors.add(new DoctorModel ("Марк Воронин", "Пол: Мужской", "Возраст: 29", "Национальность: Кыргыз", "Должность: Окулист", "Стаж: 3 года", "Офис: Central Hospital", "Номер телефона: + 996(700)168979", R.drawable.sem));
        doctors.add(new DoctorModel ("Яна Богданова", "Пол: Женский", "Возраст: 38", "Национальность: Кыргызка", "Должность: Стоматолог", "Стаж: 10 лет", "Офис: Central Hospital", "Номер телефона: + 996(700)990903", R.drawable.devyat));
    }

    public void callPhone(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}