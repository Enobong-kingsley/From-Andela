package com.example.leaderboardapp

class ModelClass (title: String?, genre: String?, year: String?)  {

    private var title: String = title!!
    private var genre: String = genre!!
    private var year: String = year!!

    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
    fun getYear(): String? {
        return year
    }
    fun setYear(year: String?) {
        this.year = year!!
    }
    fun getGenre(): String? {
        return genre
    }
    fun setGenre(genre: String?) {
        this.genre = genre!!
    }
}