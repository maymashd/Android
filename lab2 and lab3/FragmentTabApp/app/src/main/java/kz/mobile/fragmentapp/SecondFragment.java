package kz.mobile.fragmentapp;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    public static SecondFragment newInstance(Bundle bundle) {
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        return fragment;
    }


    private TextView textView;
    private TextView numberOfLikes;
    private ImageView imageView;
    private View v;
    private String name;
    public static int like=0;

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void setArguments(@Nullable Bundle args) {
        super.setArguments(args);



        name = args.getString("name");
        Log.d("lifecycle", "Second fragment setArgument" );
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("lifecycle", "Second fragment onCreateView" );
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_second, container, false);
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onDestroy() {

        Log.d("lifecycle", "Second Fragment onDestroy" );
        @NonNull Bundle outState=new Bundle();
        super.onSaveInstanceState(outState);
        outState.putString("numberOfLikes", numberOfLikes.getText().toString());
        super.onDestroy();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("lifecycle", "Second Fragment onViewCreated");
        textView = view.findViewById(R.id.name);
        imageView = (ImageView) view.findViewById(R.id.imageView2);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.me);
        }

        if (name != null) {
            textView.setText(name);
        }

        numberOfLikes = (TextView) view.findViewById(R.id.textView2);
        try {
            numberOfLikes.setText(savedInstanceState.getString("numberOfLikes"));
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lifecycle","second fragment onCreate");

        try {
            numberOfLikes.setText(savedInstanceState.getString("numberOfLikes"));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void displayReceivedData(String counter) {
        numberOfLikes.setText("Likes: " + counter);
           SecondFragment.like=Integer.parseInt(counter);
        Log.d("lifecycle", "Second Fragment displayReceivedData" );

    }

}
