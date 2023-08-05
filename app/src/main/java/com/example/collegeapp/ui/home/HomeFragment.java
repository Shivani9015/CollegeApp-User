package com.example.collegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collegeapp.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.smarteist.autoimageslider.SlideLayout;

public class HomeFragment extends Fragment {

    private ImageView map;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_home, container, false);



      map = view.findViewById(R.id.map);
      map.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              openMap();
          }
      });

      return view;
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0,0?q=Rashtraksvi Ramdhari Singh Dinakr College Of Engineering ,Begusarai");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}