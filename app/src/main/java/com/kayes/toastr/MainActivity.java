package com.kayes.toastr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.kayes.custom_toaster.ToasteR;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SuccessClick(View view) {
        ToasteR.toasterSuccess(MainActivity.this, "Success");
    }

    public void ErrorClick(View view) {
        ToasteR.toasterError(getApplicationContext(), "Error");
    }

    public void WarnClick(View view) {
        ToasteR.toasterWarn(this, "Warn");
    }
}