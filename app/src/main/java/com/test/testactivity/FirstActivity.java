package com.test.testactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class FirstActivity extends BaseActivity {
    private static final String TAG = "FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: taskid: " + getTaskId());
        //Log.i(TAG, "onCreate: " + this.toString());
        //Toast.makeText(FirstActivity.this,"onCreate:" + this.toString(),Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_first);
        Log.d(TAG, "onCreate: Hello World!");
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                //Log.i(TAG, "onClick: " + this.toString());
                //Toast.makeText(FirstActivity.this,"onClick:" + this.toString(),Toast.LENGTH_SHORT).show();

            }
        });
        //setContentView(R.layout.activity_first);
       // Button button = (Button)findViewById(R.id.button);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"You click this Button",Toast.LENGTH_SHORT).show();
            }
        });*/
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
        //button.setOnClickListener(new View.OnClickListener() {
         //   @Override
        //    public void onClick(View v) {
        //        String data = "Hello World Activity!";
         //       Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //startActivity(intent);
                //startActivityForResult(intent,1);
                /*Intent intent = new Intent("com.test.testactivity.ACTION_START");
                intent.addCategory("com.test.testactivity.MY_CATEGORY");
                startActivity(intent);
                Log.i(TAG, "onClick: start activity!");*/
               /* Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);*/
                /*Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("geo"))*/
                //Log.i(TAG, "onClick: start baidu!");
                /*Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);*/

               /* Uri uri = Uri.parse("smsto:10086");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello");
                startActivity(intent);*/

                /*Uri uri = Uri.parse("mailto:187393744@qq.com");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);*/

                /*Uri uri = Uri.parse("geo:39.9,116.3");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/
                /*Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);*/

                /*Intent lan = getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setComponent(lan.getComponent());
                startActivity(intent);*/



                //String url="mqqwpa://im/chat?chat_type=wpa&uin=501863587";
                //startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));


         //   }
        //});

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode)
        {
            case 1:
                if(resultCode==RESULT_OK)
                {
                    String str = data.getStringExtra("data");
                    Toast.makeText(FirstActivity.this,str,Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

/*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }*/

   /* public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.main, menu);
       return true;
   }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(FirstActivity.this,"add item is selected",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(FirstActivity.this,"Remove item is selected!",Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(FirstActivity.this,"No item is selected!",Toast.LENGTH_SHORT).show();

        }
        return true;
    }
}
