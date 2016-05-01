package m14x.example.com.tablethandsetsupport;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by m14x on 05/01/2016.
 */
public class ArticleFragment extends Fragment {

    private TextView headlineTxt;
    private TextView description;
    private String[] article;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.article_fragment_layout,container,false);
        headlineTxt = (TextView) view.findViewById(R.id.headingTextView);
        description = (TextView) view.findViewById(R.id.descriptionTextView);

        return view;
    }

    public void updateInfo(String headline){
        article = getResources().getStringArray(R.array.content);
        if(headline.equals("Headline 1")){
            headlineTxt.setText("News Headline 1");
            description.setText(article[0]);
        }else if(headline.equals("Headline 2")){
            headlineTxt.setText("News Headline 2");
            description.setText(article[0]);
        }
        else if(headline.equals("Headline 3")){
        headlineTxt.setText("News Headline 3");
        description.setText(article[0]);
        }
        else if(headline.equals("Headline 4")){
            headlineTxt.setText("News Headline 4");
            description.setText(article[0]);
        }
        else if(headline.equals("Headline 5")){
            headlineTxt.setText("News Headline 5");
            description.setText(article[0]);
        }
    }

}
