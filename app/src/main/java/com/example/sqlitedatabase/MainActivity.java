package com.example.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editRollno,editName,editMarks;
    Button add,delete,modify,view,viewall,show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editRollno=findViewById(R.id.editRollno);
        editMarks=findViewById(R.id.editMarks);
        editName=findViewById(R.id.editName);
        add=findViewById(R.id.add);
        delete=findViewById(R.id.delete);
        modify=findViewById(R.id.modify);
        view=findViewById(R.id.view);
        viewall=findViewById(R.id.viewall);
        show=findViewById(R.id.show);
        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        modify.setOnClickListener(this);
        view.setOnClickListener(this);
        viewall.setOnClickListener(this);
        show.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add:
                Toast.makeText(this, "Added"+add.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this, "Deleted"+delete.getText(), Toast.LENGTH_SHORT).show();
                break;
            case  R.id.modify:
                Toast.makeText(this, "Modified"+modify.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.view:
                Toast.makeText(this, "View is finished"+view.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.viewall:
                Toast.makeText(this, "View all is finished"+viewall.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.show:
                Toast.makeText(this, "shown"+show.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

