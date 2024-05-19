package com.example.thirdhomeworkthirdmonth;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView tvBook;
    public BookViewHolder(@NonNull View itemView) {
        super(itemView);

        tvBook = itemView.findViewById(R.id.tv_book);
    }

    public void onBind(String bookName) {
            tvBook.setText(bookName);
    }
}
