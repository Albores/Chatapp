package com.example.fiuady.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CreateChat extends AppCompatActivity {
    private TextView contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_chat);
        contact = findViewById(R.id.actualcontact_tv);
        Intent intent = getIntent();
        String contactusername = intent.getStringExtra(ChatActivity.EXTRA_HIDED_ID);
        contact.setText(contactusername);

    }
}
