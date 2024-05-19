package com.example.thirdhomeworkthirdmonth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> bookList = new ArrayList<>();

    private RecyclerView rvBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBook = findViewById(R.id.rv_books);

        bookList.add("Властелин колец");
        bookList.add("Гарри Поттер");
        bookList.add("Москва петушки");
        bookList.add("Огонь");
        bookList.add("Над пропастью во ржи");
        bookList.add("Великий Гэтсби");
        bookList.add("Бескрайняя ночь");
        bookList.add("Ночь нежна");
        bookList.add("Джейн Остин");
        bookList.add("Анна Каренина");
        bookList.add("Луный свет");
        bookList.add("Двенадцать стульев");
        bookList.add("Книга Илая");
        bookList.add("Братья Карамазовы");

        BookAdapter adapter = new BookAdapter(bookList);

        rvBook.setAdapter(adapter);

    }

}