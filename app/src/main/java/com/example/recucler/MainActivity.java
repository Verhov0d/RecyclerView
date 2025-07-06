package com.example.recucler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Nadpis> foto = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        RecyclerView list =findViewById(R.id.recucler);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, foto);
        list.setAdapter(adapter);

    }

    private void setData()
    {
        foto.add(new Nadpis(R.drawable.cho, "لا أحد يعرف ما هو مكتوب هنا"));
        foto.add(new Nadpis(R.drawable.ded, "Не стоило"));
        foto.add(new Nadpis(R.drawable.ok, "Хорошо"));
        foto.add(new Nadpis(R.drawable.stas, "Он работает сам"));
        foto.add(new Nadpis(R.drawable.why, "???"));
    }
}