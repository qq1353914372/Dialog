package com.helloword.lgy.dialog;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void click1(View v){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("警告");
        builder.setMessage("断网网了饿了了。。");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    public void click2(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("选择");
        final String [] content={"11","22","33"};
        builder.setSingleChoiceItems(content, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
           String item= content[which];
                Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        builder.show();
    }
    public void click3(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("选择");
        final String [] content={"11aa","22dd","33pp"};
        final boolean [] checked={false,false,false};
       builder.setMultiChoiceItems(content, checked, new DialogInterface.OnMultiChoiceClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which, boolean isChecked) {

           }
       });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                StringBuilder sb=new StringBuilder();
                for (int x=0;x<content.length;x++){
                    if (checked[x]){
                    String item=content[x];
                    sb.append(item+"--");
                }}
                Toast.makeText(MainActivity.this, sb, Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


        builder.show();
    }
    public void click4(View  v){
        ProgressDialog pd=new ProgressDialog(this);
        pd.setTitle("正玩命加载中。。。");
        pd.show();
    }
}
