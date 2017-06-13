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


/**
 * A simple {@link Fragment} subclass.
 */
public class Register extends Fragment {


    private EditText RegUsername;
    private EditText RegEmailId;
    private EditText RegPhoneNo;
    private EditText RegPassword;
    private Button RegisterButton;
    private String Username;
    private String EmailId;
    private String PhoneNo;
    private String Password;

    public Register() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        RegUsername = (EditText) view.findViewById(R.id.RegUsername);
        RegEmailId = (EditText) view.findViewById(R.id.RegEmailId);
        RegPhoneNo = (EditText) view.findViewById(R.id.RegPhoneNo);
        RegPassword = (EditText) view.findViewById(R.id.RegPassword);
        RegisterButton = (Button) view.findViewById(R.id.Register);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
        return view;
    }

    private void Register() {
        initialize();

        if (!registerfail()) {
            Toast.makeText(getActivity(), "Registration failed! || Try Again", Toast.LENGTH_SHORT).show();
        } else {
            registerok();
        }
    }

    private void registerok() {
        Toast.makeText(getActivity(), "Welcome " + Username, Toast.LENGTH_SHORT).show();
    }

    private boolean registerfail() {
        boolean validation = true;
        if (Username.isEmpty() || Username.length() > 25) {
            RegUsername.setError("Invalid username");
            validation = false;
        }
        if (EmailId.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(EmailId).matches()) {
            RegEmailId.setError("Invalid EmailId");
            validation = false;
        }
        if (PhoneNo.isEmpty() || PhoneNo.length() == 10) {
            RegPhoneNo.setError("Invalid PhoneNo.");
            validation = false;
        }
        if (Password.isEmpty() || Password.length() > 6) {
            RegPassword.setError("Invalid Password");
            validation = false;
        }
        return validation;
    }

    private void initialize() {
        Username = RegUsername.getText().toString().trim();
        EmailId = RegEmailId.getText().toString().trim();
        PhoneNo = RegPhoneNo.getText().toString().trim();
        Password = RegPassword.getText().toString().trim();

    }

}
