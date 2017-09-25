package com.example.zalectrial.mobiledev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import java.text.SimpleDateFormat;

public class FormActivity extends AppCompatActivity {

    Image image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        image = getIntent().getExtras().getParcelable(String.valueOf(R.string.image));
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        EditText imageName = (EditText) findViewById(R.id.image_name);
        imageName.setHint(image.name);

        EditText imageLocation = (EditText) findViewById(R.id.image_location);
        imageLocation.setHint(image.URL == null ? "URL" : image.URL);

        EditText imageKeywords = (EditText) findViewById(R.id.image_keywords);
        imageKeywords.setHint(image.name);

        EditText imageDate = (EditText) findViewById(R.id.image_date);
        imageDate.setHint(format.format(image.date));

        EditText imageOwner = (EditText) findViewById(R.id.image_owner);
        imageOwner.setHint(image.email == null ? "E-mail" : image.email);

        EditText imageRating = (EditText) findViewById(R.id.image_rating);
        imageRating.setHint(image.rating == 0 ? "3.5" : String.valueOf(image.rating));
    }
}
