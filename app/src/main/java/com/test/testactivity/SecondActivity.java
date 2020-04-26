package com.test.testactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: taskid: " + getTaskId());
        Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Button button2 = (Button)findViewById(R.id.button2);
        Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i(TAG, "onClick: SecondActivity!" + this.toString());
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
               /* Intent intent = new Intent();
                intent.putExtra("data","Test Reuslt");
                setResult(RESULT_OK,intent);
                finish();*/
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: taskid: " + getTaskId());
    }
}
