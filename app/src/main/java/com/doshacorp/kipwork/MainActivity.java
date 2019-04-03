package com.doshacorp.kipwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener onClickListener = new HandleDemoLinks();
        findViewById(R.id.btn_fig1).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fig3).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fig4).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fig5).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fig6).setOnClickListener(onClickListener);
        findViewById(R.id.btn_fig7).setOnClickListener(onClickListener);
    }

    class HandleDemoLinks implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Class dest = null;
            switch (v.getId()) {
                case R.id.btn_fig1:
                    dest = fig1.class;
                    break;
                    case R.id.btn_fig3:
                    dest = fig3.class;
                    break;
                case R.id.btn_fig4:
                    dest = fig4.class;
                    break;
                case R.id.btn_fig5:
                    dest = fig5.class;
                    break;
                case R.id.btn_fig6:
                    dest = fig6.class;
                    break;
                    case R.id.btn_fig7:
                    dest = fig7.class;
                    break;
            }
            if (dest!=null) {
                startActivity(new Intent(MainActivity.this, dest));
            }
        }
    }
}
