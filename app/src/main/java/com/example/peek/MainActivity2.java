package com.example.peek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.name1);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String receivedValue = extras.getString("inputValueKey");
            textView.append(receivedValue);
        }
    }

    public void Bsc(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Main%20Campus/school-of-sciences/computer-science/bsc-(computer-science,-statisticshonourshonours-with-research)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);

    }

    public void Bca(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Main%20Campus/school-of-sciences/computer-science/bca-(honourshonours-with-research)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }

    public void Bsccme(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Yeshwanthpur%20Campus/school-of-sciences/computer-science/bsc-(computer-science,-mathematicshonourshonours-with-research)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }

    public void MScds(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Main%20Campus/school-of-sciences/computer-science/msc-(computer-science-and-applications)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }

    public void MSccs(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Main%20Campus/school-of-sciences/computer-science/master-of-science-(artificial-intelligence-and-machine-learning)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }

    public void Mca(View view) {
        String websiteUrl = "https://christuniversity.in/courses/Main%20Campus/school-of-sciences/computer-science/master-of-computer-applications-(mca)";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }
}