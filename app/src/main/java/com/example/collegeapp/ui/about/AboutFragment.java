package com.example.collegeapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collegeapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

private ViewPager viewPager;
private  BranchAdapter adapter;
private List<BranchModel>list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =inflater.inflate(R.layout.fragment_about, container, false);

       list= new ArrayList<>();
       list.add(new BranchModel(R.drawable.ic_comp,"Computer Science","Computer Science  and Engineering started in year 2016.At present intake seat in Ist year is 60 student,and in lateral entryis 6")
);
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering","Mechanical Engineering  started in year 2016.At present intake seat in Ist year is 60 student,and in lateral entryis 6")
        );
        list.add(new BranchModel(R.drawable.ic_electrical,"Electrical and Electronics","Electrical and Electronics started in year 2016.At present intake seat in Ist year is 60 student,and in lateral entryis 6")
        );
        list.add(new BranchModel(R.drawable.ic_civil,"Civil Engineering","Civil Engineering started in year 2016.At present intake seat in Ist year is 60 student,and in lateral entries 6")
        );
        list.add(new BranchModel(R.drawable.ic_chemical,"Chemical Engineering","Chemical Engineering started in year 2023.At present intake seat in Ist year is 60 student,and in lateral entries 6")
        );

         adapter = new BranchAdapter(getContext(),list);

         viewPager= view.findViewById(R.id.viewPager);
         viewPager.setAdapter(adapter);
        ImageView imageView=view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/rrsdce-a8863.appspot.com/o/gallery%2F%5BB%409c53576jpg?alt=media&token=84da91ba-7a94-4bbd-9e26-29b5e29b2bc0")
        .into(imageView);
        return view;
    }
}