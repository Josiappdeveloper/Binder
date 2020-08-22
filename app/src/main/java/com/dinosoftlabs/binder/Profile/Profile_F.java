package com.dinosoftlabs.binder.Profile;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dinosoftlabs.binder.AppUtils.MySharePreferences;
import com.dinosoftlabs.binder.CodeClasses.Variables;
import com.dinosoftlabs.binder.Main_Menu.MainMenuActivity;
import com.dinosoftlabs.binder.Main_Menu.RelateToFragment_OnBack.RootFragment;
import com.dinosoftlabs.binder.Profile.EditProfile.EditProfile_F;
import com.dinosoftlabs.binder.Profile.Profile_Details.Profile_Details_F;
import com.dinosoftlabs.binder.R;
import com.dinosoftlabs.binder.Settings.Setting_F;
import com.squareup.picasso.Picasso;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_F extends RootFragment {

    View view;
 /*   Context context;
    public static ImageView profile_image;
    TextView user_name;
    public static TextView age;
    LinearLayout setting_layout,edit_profile_layout;

    MySharePreferences sharePreferences;
    TextView tvname,tvcompleteprofile, tvverify, tvinsta, tvpreference, tvyourlikes, tvrecent, tvlovestories,tvhelp;
    ImageView img_one;
    Button btnupgrade;

    public Profile_F() {
        // Required empty public constructor
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.activity_profile, container, false);
        /*context=getContext();

        sharePreferences= new MySharePreferences(getActivity());
        tvname=(TextView)view.findViewById(R.id.tvname);
        tvcompleteprofile=(TextView)view.findViewById(R.id.tvcomplete);
        tvverify=(TextView)view.findViewById(R.id.tvverify);
        tvinsta=(TextView)view.findViewById(R.id.tvinsta);
        tvpreference=(TextView)view.findViewById(R.id.tvpreference);
        tvyourlikes=(TextView)view.findViewById(R.id.tvyourlikes);
        tvrecent=(TextView)view.findViewById(R.id.tvrecent);
        tvlovestories=(TextView)view.findViewById(R.id.tvlovestories);
        tvhelp=(TextView)view.findViewById(R.id.tvhelp);
        img_one=(ImageView)view.findViewById(R.id.img_one);
        btnupgrade=(Button)view.findViewById(R.id.btnupgrade);

        tvname.setText(sharePreferences.getName());
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getActivity().getContentResolver(), Uri.parse(sharePreferences.getImg_one()));
            img_one.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        tvcompleteprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(context,EditProfileActivity.class);
                startActivity(it);
            }
        });
*/
        /*edit_profile_layout=view.findViewById(R.id.edit_profile_layout);
        edit_profile_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editprofile();
            }
        });

        setting_layout=view.findViewById(R.id.setting_layout);
        setting_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Setting_profile();
            }
        });

        profile_image=view.findViewById(R.id.profile_image);
        user_name=view.findViewById(R.id.user_name);
        age=view.findViewById(R.id.age);

        // show the picture age and username of the user

        if(MainMenuActivity.user_pic!=null  && !MainMenuActivity.user_pic.equals("") ){

            Uri uri;
            if(MainMenuActivity.user_pic.contains("http"))
                uri = Uri.parse(MainMenuActivity.user_pic);
            else
                uri = Uri.parse(Variables.image_base_url+MainMenuActivity.user_pic);

            Log.d(Variables.tag,Variables.image_base_url+MainMenuActivity.user_pic);
            profile_image.setImageURI(uri);
        }

        user_name.setText(MainMenuActivity.user_name);
        age.setText(" "+MainMenuActivity.birthday);


        profile_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profile_detail();
            }
        });*/

        return view;
    }


    // open the view of Edit profile where 6 pic is visible
        public void Profile_detail(){

        Profile_Details_F profile_details_f = new Profile_Details_F();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.in_from_bottom, R.anim.out_to_top, R.anim.in_from_top, R.anim.out_from_bottom);
        transaction.addToBackStack(null);
        transaction.replace(R.id.MainMenuFragment, profile_details_f).commit();

    }



    // open the view of Edit profile where 6 pic is visible
    public void Editprofile(){
        EditProfile_F editProfile_f = new EditProfile_F();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.in_from_bottom, R.anim.out_to_top, R.anim.in_from_top, R.anim.out_from_bottom);
        transaction.addToBackStack(null);
        transaction.replace(R.id.MainMenuFragment, editProfile_f,"EditProfile_F").commit();
    }


    // open the view of Edit profile where 6 pic is visible
    public void Setting_profile(){
        Setting_F setting_f = new Setting_F();
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.in_from_bottom, R.anim.out_to_top, R.anim.in_from_top, R.anim.out_from_bottom);
        transaction.addToBackStack(null);
        transaction.replace(R.id.MainMenuFragment, setting_f).commit();
    }





}
