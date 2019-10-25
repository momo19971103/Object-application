package com.example.c1025;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.c1025.R.id.checkBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText) ;

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, isChecked + "", Toast.LENGTH_SHORT).show();
                if(isChecked){
                    String editTextString = "內容是:"+editText.getText().toString();
                    Toast.makeText(MainActivity.this, editTextString + "", Toast.LENGTH_SHORT).show();
                }
            }
        });


        RadioButton programButton = (RadioButton) findViewById(R.id.radioButton);
        programButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton RadioGroup, boolean isChecked) {
                        Toast.makeText(MainActivity.this, "安安", Toast.LENGTH_SHORT).show();
            }
        });

        Switch switchButon = (Switch) findViewById(R.id.switch1);
        switchButon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton SwitchButtonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, isChecked + "", Toast.LENGTH_SHORT).show();

            }});
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        final String[] lunch = {"雞腿飯", "魯肉飯", "排骨飯", "水餃", "陽春麵"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);
        spinner.setAdapter(lunchList);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你選的是" + lunch[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String seekBarString = "現在進度"+progress+"/100";
                Toast.makeText(MainActivity.this, seekBarString , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


}
