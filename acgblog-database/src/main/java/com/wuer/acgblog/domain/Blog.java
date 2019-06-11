package com.wuer.acgblog.domain;

import java.util.Date;
import javax.persistence.*;

public class Blog {
    /**
     * 主键、自增
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间为第一次修改时间
     */
    @Column(name = "TIME")
    private Date time;

    /**
     * 文章标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 文章作者
     */
    @Column(name = "AUTHOR")
    private String author;

    /**
     * 图片的URL
     */
    @Column(name = "PICTURE")
    private String picture;

    /**
     * 文章内容
     */
    @Column(name = "CONTENT")
    private String content;

    /**
     * 获取主键、自增
     *
     * @return ID - 主键、自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键、自增
     *
     * @param id 主键、自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取创建时间为第一次修改时间
     *
     * @return TIME - 创建时间为第一次修改时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置创建时间为第一次修改时间
     *
     * @param time 创建时间为第一次修改时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取文章标题
     *
     * @return TITLE - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文章作者
     *
     * @return AUTHOR - 文章作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置文章作者
     *
     * @param author 文章作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取图片的URL
     *
     * @return PICTURE - 图片的URL
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置图片的URL
     *
     * @param picture 图片的URL
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取文章内容
     *
     * @return CONTENT - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}