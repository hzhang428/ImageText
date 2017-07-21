package com.example.haozhang.imagetext;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.haozhang.imagetext.draweetext.DraweeSpan;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String text1 = "对于很多技术很好的大神，请轻拍这个弱爆了的技能=v=\r\n\r\n……对于Windows8来说应该远远的没有这么麻烦……\r\n\r\n需要的软件应该是内置的，Windows gadget，如果没有内置的可以在网上下载一个……官网上好像已经停止对win7的供应的样子……\r\n\r\n进入google日历里面的setting，然后under my calendars下面点击自己的名字（或者是用户名之类的……？），接下来点击private address旁边的ical";
    String text2 = "获取一串网址，复制保存\r\n\r\n第二部打开windows gadget";
    String text3 = "我的是这个样子的\r\n\r\n点击calendar，gadget就会自动跳出来";
    String text4 = "随后自然是设定again，将获取的ical网址输入进去";
    String text5 = "随后日历就工作啦╮(╯▽╰)╭\r\n\r\n只有两种模式设置，可以长这样和这样\r\n\r\n";

    String url1 = "http://www.1point3acres.com/bbs/data/attachment/forum/201405/24/120857ckecodr3xdid2i8y.png";
    String url2 = "http://www.1point3acres.com/bbs/data/attachment/forum/201405/24/120900niixaiiddiicispi.png";
    String url3 = "http://www.1point3acres.com/bbs/data/attachment/forum/201405/24/120903cteucmw4z1et121n.png";
    String url4 = "http://www.1point3acres.com/bbs/data/attachment/forum/201405/24/121106uo8mrmsihx0uh5hh.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView.setText(buildText());
    }

    private CharSequence buildText() {
        SpannableStringBuilder builder = new SpannableStringBuilder();
        Drawable placeHolder = new ColorDrawable(Color.LTGRAY);

        builder.append(text1);
        builder.append("\n");


        int start = builder.length();
        builder.append("[img]");
        DraweeSpan span = new DraweeSpan.Builder(url1)
                .setLayout(1000, 600)
                .setPlaceHolderImage(placeHolder)
                .build();
        builder.setSpan(span, start, builder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        builder.append("\n");
        builder.append(text2);
        builder.append("\n");


        start = builder.length();
        builder.append("[img]");
        span = new DraweeSpan.Builder(url2)
                .setLayout(1000, 600)
                .setPlaceHolderImage(placeHolder)
                .build();
        builder.setSpan(span, start, builder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        builder.append("\n");
        builder.append(text3);
        builder.append("\n");


        start = builder.length();
        builder.append("[img]");
        span = new DraweeSpan.Builder(url3)
                .setLayout(1000, 600)
                .setPlaceHolderImage(placeHolder)
                .build();
        builder.setSpan(span, start, builder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        builder.append("\n");
        builder.append(text4);
        builder.append("\n");


        start = builder.length();
        builder.append("[img]");
        span = new DraweeSpan.Builder(url4)
                .setLayout(1000, 600)
                .setPlaceHolderImage(placeHolder)
                .build();
        builder.setSpan(span, start, builder.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        builder.append("\n");
        builder.append(text5);
        builder.append("\n");
        return builder;
    }

}
