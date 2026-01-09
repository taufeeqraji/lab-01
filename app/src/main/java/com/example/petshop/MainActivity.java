package com.example.petshop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);

        Mood mood1 = new HappyMood();
        Mood mood2 = new SadMood(new Date());

        String moodText1 = mood1.getMoodString();
        String moodText2 = mood2.getMoodString();

        Date date1 = mood1.getDate();
        mood2.setDate(new Date());
    }
}
