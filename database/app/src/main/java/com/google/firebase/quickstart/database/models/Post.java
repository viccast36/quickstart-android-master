package com.google.firebase.quickstart.database.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

// [START post_class]
@IgnoreExtraProperties
public class Post {

    public String uid;
    public String poster;
    public String title;
    public String author;
    public String isbn;
    public String bookdesc;
    public Map<String, Boolean> stars = new HashMap<>();

    public Post() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Post(String uid, String poster, String title, String author, String isbn, String bookdesc) {
        this.uid = uid;
        this.poster = poster;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.bookdesc = bookdesc;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("Swappr", poster);
        result.put("Title", title);
        result.put("Author", author);
        result.put("ISBN", isbn);
        result.put("Book Description", bookdesc);

        return result;
    }
    // [END post_to_map]

}
// [END post_class]
