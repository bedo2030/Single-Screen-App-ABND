package com.example.android.sinaiuniversity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Head lines Font path
    private final String headLinesFontPath = "junegull.ttf";

    // Head lines Font
    private Typeface headLinesFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headLinesFont = Typeface.createFromAsset(getResources().getAssets(), headLinesFontPath);

        TextView universityAddressHeadLine = findViewById(R.id.address_title_textView);
        universityAddressHeadLine.setTypeface(headLinesFont);

        TextView contactInfoHeadLine = findViewById(R.id.contact_hedline_textView);
        contactInfoHeadLine.setTypeface(headLinesFont);

        TextView workingHoursHeadLine = findViewById(R.id.working_hours_textView);
        workingHoursHeadLine.setTypeface(headLinesFont);

    }
}
