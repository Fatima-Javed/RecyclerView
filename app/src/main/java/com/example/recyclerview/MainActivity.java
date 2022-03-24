package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<News> newsArrayList;
    MyAdapter myAdapter;
    String[] newsHeading;
    int[] imageResourceId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        newsArrayList= new ArrayList<News>();

        myAdapter = new MyAdapter(this,newsArrayList);
        recyclerView.setAdapter(myAdapter);

        newsHeading= new String[]{
             "PM Imran says has a 'massive surprise up his sleeve for opposition will never resign",
              "Russia warns Europe of energy market collapse",
              "In picture: Impressive airshow, parade mark Pakistan Day",
              "Ministers mock Bilawal for 'flop' Malakand show",
              "Punjab float attracts National Day Parade audience",
              "PAK vs AUS prediction- Who Will Win thw Match Between Pakistan vs Australia?",
              "Punjab to hand back control of four christian school to churches",
              "Babar Azam surges up in rankings chart after stunning knock ",
                "Pakistan PM Imran Khan fined Rs 50,000 for violating election code",
                "Economic Development: CPEC's 2nd phase to reinforce Pakistan efforts, Wang told",
                "Digital Pakistan triggering Economic Boom",
                "Pakistan air force plane crashes in Peshawar, killing two pilots",
                "Cash-strapped Pakistan says China agreed to rollover $4.2 billion debt",
                "Economy On Right Growth Path",
                "Pakistan's Exports to Canada Up by 24%",
                "China ramps up arms exports to Pakistan, aiming to squeeze ...",
                "How protected are we against Covid-19? Scientists search for a test to measure immunity",
                "European countries now battling Covid BA.2 variant lifted restrictions too 'brutally,' WHO warns",
                };
        imageResourceId=new int[]
                {
                        R.drawable.a,
                        R.drawable.b,
                        R.drawable.c,
                        R.drawable.d,
                        R.drawable.e,
                        R.drawable.g,
                        R.drawable.f,
                        R.drawable.h,
                        R.drawable.i,
                        R.drawable.j,
                        R.drawable.k,
                        R.drawable.l,
                        R.drawable.m,
                        R.drawable.n,
                        R.drawable.r,
                        R.drawable.p,
                        R.drawable.q,
                        R.drawable.s,
                };
        getData();
    }

    private void getData() {

        for(int i=0;i<newsHeading.length;i++)
        {
            News news= new News(newsHeading[i],imageResourceId[i]);
            newsArrayList.add(news);
        }

        myAdapter.notifyDataSetChanged();
    }
}