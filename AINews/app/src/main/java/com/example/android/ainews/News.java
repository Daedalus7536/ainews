package com.example.android.ainews;

public class News {


    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Section of the article
     */
    private String mSection;

    /**
     * Date of the article
     */
    private String mDate;
    /**
     * Url of the article
     */
    private String mUrl;
    /**
     * Author of the article
     */
    private String mAuthor;

    /**
     * Create a new News object.
     *
     * @param section is the section of the article
     * @param title   is the title of the article
     * @param date    is the date of the article
     * @param url     is the web address of the article.
     * @param author  is the author of the article
     */
    public News(String title, String author, String section, String date, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
        mAuthor = author;
    }


    /**
     * Get the section the article is in.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Get the title of the article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the date of the article
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Get the author of the article
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Get the url of the article
     */
    public String getUrl() {
        return mUrl;
    }
}
