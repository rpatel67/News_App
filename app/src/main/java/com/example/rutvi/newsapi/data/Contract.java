package com.example.rutvi.newsapi.data;

import android.provider.BaseColumns;



public class Contract {

    public static class TABLE_NEWS implements BaseColumns {

        public static final String TABLE_NAME = "newsitems";

        public static final String COLUMN_NAME_AUTHOR = "author";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "desc";
        public static final String COLUMN_NAME_URL = "url";
        public static final String COLUMN_NAME_URL_TO_IMAGE = "urlToImage";
        public static final String COLUMN_NAME_PUBLISHED_AT = "publishedAt";
    }
}
