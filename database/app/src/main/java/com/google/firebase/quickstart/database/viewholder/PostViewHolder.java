package com.google.firebase.quickstart.database.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public TextView isbnView;
    public TextView bookDescView;

    public PostViewHolder(View itemView) {
        super(itemView);
        //need to update these values here
        titleView = itemView.findViewById(R.id.book_title);
        authorView = itemView.findViewById(R.id.book_author);
        bookDescView = itemView.findViewById(R.id.book_desc);
        isbnView = itemView.findViewById(R.id.book_isbn);

    }

}
