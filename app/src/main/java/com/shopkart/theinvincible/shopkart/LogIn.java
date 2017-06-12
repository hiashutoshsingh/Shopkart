package com.shopkart.theinvincible.shopkart;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Patterns;
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
        View view = inflater.inflate(R.layout.fragment_log_in, container, false);
        LoginEmailId = (EditText) view.findViewById(R.id.login_emailId);
        LoginPassword = (EditText) view.findViewById(R.id.login_password);
        LoginButton = (Button) view.findViewById(R.id.login_button);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
        return view;
    }

    private void Register() {
        intialize();

        if (!LogInFail()) {
            Toast.makeText(getActivity(), "LogIn Failed! || Try Again", Toast.LENGTH_SHORT).show();
        } else {
            LogInOk();
        }
    }

    private void LogInOk() {

    }

    private boolean LogInFail() {
        boolean validation = true;
        if (EmailId.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(EmailId).matches()) {
            LoginEmailId.setError("Enter Valid Email-Id");
            validation = false;
        }
        if (Password.isEmpty()) {
            LoginPassword.setError("Enter Valid Password");
            validation = false;
        }
        return validation;
    }

    private void intialize() {
        EmailId = LoginEmailId.getText().toString().trim();
        Password = LoginPassword.getText().toString().trim();

    }
}
