package com.wordy.rest.entity;


import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "post_title")
    private String post_title;

    @Column(name = "post_body")
    private String post_body;

    @Column(name = "post_owner_id")
    private int post_owner_id;

    @Column(name = "likes_count")
    private int likes_count;

    @Column(name = "dislikes_count")
    private int dislikes_count;

    @Column(name = "views_count")
    private int views_count;


    public Post() {
    }

    public Post(String post_title, String post_body, int post_owner_id, int likes_count, int dislikes_count, int views_count) {
        this.post_title = post_title;
        this.post_body = post_body;
        this.post_owner_id = post_owner_id;
        this.likes_count = likes_count;
        this.dislikes_count = dislikes_count;
        this.views_count = views_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public String getPost_body() {
        return post_body;
    }

    public void setPost_body(String post_body) {
        this.post_body = post_body;
    }

    public int getPost_owner_id() {
        return post_owner_id;
    }

    public void setPost_owner_id(int post_owner_id) {
        this.post_owner_id = post_owner_id;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public int getDislikes_count() {
        return dislikes_count;
    }

    public void setDislikes_count(int dislikes_count) {
        this.dislikes_count = dislikes_count;
    }

    public int getViews_count() {
        return views_count;
    }

    public void setViews_count(int views_count) {
        this.views_count = views_count;
    }
}
