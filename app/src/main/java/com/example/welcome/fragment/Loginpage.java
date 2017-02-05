package com.example.welcome.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by welcome on 2/5/2017.
 */

public class Loginpage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.login,container,false);


        Button btn1,btn2;
        final EditText user,pass;

        user = (EditText) view.findViewById(R.id.ET_user);
        pass = (EditText) view.findViewById(R.id.ET_pass);
        btn1 = (Button) view.findViewById(R.id.btnlog);
        btn2 = (Button) view.findViewById(R.id.btnclear);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (user.getText().toString().equals("pankti") && (pass.getText().toString().equals("pankti"))) {

                    Toast.makeText(getActivity(),"Congratulations".concat("You are successfully login"),Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getActivity(),"Sorry".concat("You are unauthorized"),Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                pass.setText("");
            }
        });
        return view;


    }
}
