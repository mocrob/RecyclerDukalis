package com.example.recycler.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycler.Issue;
import com.example.recycler.R;
import com.example.recycler.RecyclerViewAdapter;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    public View root;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_main, container, false);
        //final TextView textView = root.findViewById(R.id.section_label);
        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
                 RecyclerView recyclerView;
                 RecyclerView.Adapter adapter;
                 RecyclerView.LayoutManager layoutManager;
                recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                ArrayList<Issue> recyclerViewItems = new ArrayList<>();
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Подстричь газон","На дворе опять много травы",
                        "Here long description",R.drawable.ic_ac_unit_black_24dp,100));
                recyclerViewItems.add(new Issue("Купить продукты","Я инвалид и не могу выходить из дома",
                        "Here long description",R.drawable.ic_accessible_black_24dp,7500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));
                recyclerViewItems.add(new Issue("Найти собаку","Пропал мой любимый черный лабрадор",
                        "Here long description",R.drawable.ic_whatshot_black_24dp,3500));

                //recyclerView.setHasFixedSize(true);
                adapter = new RecyclerViewAdapter(recyclerViewItems);
                recyclerView.setAdapter(adapter);
                recyclerView.setItemAnimator(new DefaultItemAnimator());

            }
        });
        return root;
    }
}