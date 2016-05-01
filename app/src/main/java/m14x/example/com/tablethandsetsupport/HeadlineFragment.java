package m14x.example.com.tablethandsetsupport;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * Created by m14x on 05/01/2016.
 */
public class HeadlineFragment extends Fragment {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    String[] headlines;
    OnHeadlineClickListener onHeadlineClickListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.headline_fragment_layout,container,false);
        listView = (ListView) view.findViewById(R.id.listHeadline);
        headlines = getResources().getStringArray(R.array.title);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.item,R.id.item_row,headlines);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String heading = headlines[position];
                onHeadlineClickListener.headLineSelected(heading);

            }
        });

        return view;
    }

    public interface OnHeadlineClickListener{
        public void headLineSelected(String headline);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            onHeadlineClickListener = (OnHeadlineClickListener) context;
        }catch (Exception e){

        }
    }
}
