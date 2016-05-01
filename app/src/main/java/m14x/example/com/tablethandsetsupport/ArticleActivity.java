package m14x.example.com.tablethandsetsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        String heading;
        Intent intent = getIntent();
        heading = intent.getStringExtra("headline");
        ArticleFragment articleFragment = (ArticleFragment) getSupportFragmentManager().findFragmentById(R.id.articleFragment);
        articleFragment.updateInfo(heading);
    }



}
