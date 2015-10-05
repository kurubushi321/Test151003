package com.example.shinya321.test151003;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_img);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** --------------
     * 2015.10.03 新規作成
     * STARTボタン押下時input1画面へ遷移するクラス
      * @param view
     */
    public void onClick2input1(View view) {
        switch(view.getId()){
            case R.id.START:
                Intent intent=  new Intent(MainActivity.this, Input1.class);
                try {
                    startActivity(intent);
                }catch(Exception e){
                    Toast.makeText(this, "メイン画面から入力画面(1/2)に進む際にエラー発生", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
