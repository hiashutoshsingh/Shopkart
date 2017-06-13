package com.shopkart.theinvincible.shopkart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


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

        Username = RegUsername.getText().toString().trim();
        EmailId = RegEmailId.getText().toString().trim();
        PhoneNo = RegPhoneNo.getText().toString().trim();
        Password = RegPassword.getText().toString().trim();

        if (Username.isEmpty() || Username.length() > 30) {
            RegUsername.setError("Invalid username");
            RegUsername.requestFocus();
        }
        if (EmailId.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(EmailId).matches()) {
            RegEmailId.setError("Invalid EmailId");
            RegEmailId.requestFocus();
        }
        if (PhoneNo.isEmpty()) {
            RegPhoneNo.setError("Invalid PhoneNo.");
            RegPhoneNo.requestFocus();
        }
        if (Password.isEmpty()) {
            RegPassword.setError("Invalid Password");
            RegPassword.requestFocus();
        }
        if (!EmailId.equals("") &&
                RegPassword.getText().toString().length() >= 6 &&
                !RegPassword.getText().toString().trim().equals("")
                && android.util.Patterns.EMAIL_ADDRESS.matcher(EmailId).matches() &&
                !RegPhoneNo.getText().toString().equals("") &&
                RegPhoneNo.getText().toString().length() >= 10) {
// do  your action
        }
    }


}
