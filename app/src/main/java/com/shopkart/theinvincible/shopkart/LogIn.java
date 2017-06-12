package com.shopkart.theinvincible.shopkart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LogIn extends Fragment {

    private EditText LoginEmailId;
    private EditText LoginPassword;
    private Button LoginButton;
    private String EmailId;
    private String Password;

    public LogIn() {
    }

    public static LogIn newInstance() {
        LogIn fragment = new LogIn();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        LoginEmailId = (EditText) container.findViewById(R.id.login_emailId);
        LoginPassword = (EditText) container.findViewById(R.id.login_password);
        LoginButton = (Button) container.findViewById(R.id.login_button);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        return view;
    }

    private void register() {
        intialize();

        if (!LogInFail()){
            Toast.makeText(getActivity(),"fdfdf",Toast.LENGTH_SHORT).show();
        }
    }

    private boolean LogInFail() {
        boolean validation=true;


        return validation;
    }

    private void intialize() {
        EmailId=LoginEmailId.getText().toString().trim();
        Password=LoginPassword.getText().toString().trim();

    }


}
