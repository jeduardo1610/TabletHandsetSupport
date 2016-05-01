package m14x.example.com.tablethandsetsupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.app.Fragment;

public class MainActivity extends AppCompatActivity implements HeadlineFragment.OnHeadlineClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void headLineSelected(String headline) {

        ArticleFragment articleFragment = (ArticleFragment) getSupportFragmentManager().findFragmentById(R.id.articleFragment);

        if(articleFragment == null){
            Intent intent = new Intent(this,ArticleActivity.class);
            intent.putExtra("headline",headline);
            startActivity(intent);
        }else{
            articleFragment.updateInfo(headline);
        }



    }
}
