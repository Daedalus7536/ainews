package com.example.android.ainews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {


    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_item, parent, false);

        }

        // Find the article at the given position in the list of articles
        News currentNews = getItem(position);
        // Get the section the article appears in
        String section = currentNews.getSection();
        // Find the TextView with view ID section
        TextView sectionView = listItemView.findViewById(R.id.section);
        // Display the section of the current article in that TextView
        sectionView.setText(section);

        // Get the title of the article
        String title = currentNews.getTitle();
        // Find the TextView with view ID title
        TextView TitleView = listItemView.findViewById(R.id.title);
        // Display the title of the current article in that TextView
        TitleView.setText(title);


        /* Find the TextView with the article publication date and display the date */
        String date = currentNews.getDate();
        // Find the TextView with view ID date
        TextView dateView = listItemView.findViewById(R.id.date);
        // Display the date of the current article in that TextView
        dateView.setText(date);

        /* Find the TextView with the article publication date and display the date */
        String author = currentNews.getAuthor();
        // Find the TextView with view ID author
        TextView authorView = listItemView.findViewById(R.id.author);
        // Display the author of the current article in that TextView
        authorView.setText(author);
        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
