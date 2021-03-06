package com.dandelion.memberapp.model.po;

import java.util.Date;

public class Feed {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Long useridfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Content
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.URL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String url;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.ImageURL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String imageurl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.AllowComment
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Boolean allowcomment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.IsPublic
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Boolean ispublic;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.IsDeleted
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Boolean isdeleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.ForwardIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String forwardidfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Date createddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Date modifieddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.CommentCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer commentcount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.ForwardCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer forwardcount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.LikeCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer likecount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Level
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer level;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Weight
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer weight;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Sort
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer sort;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Title
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Referrer
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String referrer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Remark1
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String remark1;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Remark2
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String remark2;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.Remark3
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String remark3;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_feed.isOfficial
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Boolean isofficial;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.ID
	 * @return  the value of tb_feed.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.ID
	 * @param id  the value for tb_feed.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.UserIDFK
	 * @return  the value of tb_feed.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Long getUseridfk() {
		return useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.UserIDFK
	 * @param useridfk  the value for tb_feed.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setUseridfk(Long useridfk) {
		this.useridfk = useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Content
	 * @return  the value of tb_feed.Content
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Content
	 * @param content  the value for tb_feed.Content
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.URL
	 * @return  the value of tb_feed.URL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.URL
	 * @param url  the value for tb_feed.URL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.ImageURL
	 * @return  the value of tb_feed.ImageURL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getImageurl() {
		return imageurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.ImageURL
	 * @param imageurl  the value for tb_feed.ImageURL
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.AllowComment
	 * @return  the value of tb_feed.AllowComment
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Boolean getAllowcomment() {
		return allowcomment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.AllowComment
	 * @param allowcomment  the value for tb_feed.AllowComment
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setAllowcomment(Boolean allowcomment) {
		this.allowcomment = allowcomment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.IsPublic
	 * @return  the value of tb_feed.IsPublic
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Boolean getIspublic() {
		return ispublic;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.IsPublic
	 * @param ispublic  the value for tb_feed.IsPublic
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setIspublic(Boolean ispublic) {
		this.ispublic = ispublic;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.IsDeleted
	 * @return  the value of tb_feed.IsDeleted
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Boolean getIsdeleted() {
		return isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.IsDeleted
	 * @param isdeleted  the value for tb_feed.IsDeleted
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.ForwardIDFK
	 * @return  the value of tb_feed.ForwardIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getForwardidfk() {
		return forwardidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.ForwardIDFK
	 * @param forwardidfk  the value for tb_feed.ForwardIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setForwardidfk(String forwardidfk) {
		this.forwardidfk = forwardidfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.CreatedDate
	 * @return  the value of tb_feed.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Date getCreateddate() {
		return createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.CreatedDate
	 * @param createddate  the value for tb_feed.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.ModifiedDate
	 * @return  the value of tb_feed.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Date getModifieddate() {
		return modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.ModifiedDate
	 * @param modifieddate  the value for tb_feed.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.CommentCount
	 * @return  the value of tb_feed.CommentCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getCommentcount() {
		return commentcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.CommentCount
	 * @param commentcount  the value for tb_feed.CommentCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setCommentcount(Integer commentcount) {
		this.commentcount = commentcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.ForwardCount
	 * @return  the value of tb_feed.ForwardCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getForwardcount() {
		return forwardcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.ForwardCount
	 * @param forwardcount  the value for tb_feed.ForwardCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setForwardcount(Integer forwardcount) {
		this.forwardcount = forwardcount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.LikeCount
	 * @return  the value of tb_feed.LikeCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getLikecount() {
		return likecount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.LikeCount
	 * @param likecount  the value for tb_feed.LikeCount
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setLikecount(Integer likecount) {
		this.likecount = likecount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Level
	 * @return  the value of tb_feed.Level
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Level
	 * @param level  the value for tb_feed.Level
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Weight
	 * @return  the value of tb_feed.Weight
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getWeight() {
		return weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Weight
	 * @param weight  the value for tb_feed.Weight
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Sort
	 * @return  the value of tb_feed.Sort
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Sort
	 * @param sort  the value for tb_feed.Sort
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Title
	 * @return  the value of tb_feed.Title
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Title
	 * @param title  the value for tb_feed.Title
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Referrer
	 * @return  the value of tb_feed.Referrer
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getReferrer() {
		return referrer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Referrer
	 * @param referrer  the value for tb_feed.Referrer
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Remark1
	 * @return  the value of tb_feed.Remark1
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Remark1
	 * @param remark1  the value for tb_feed.Remark1
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Remark2
	 * @return  the value of tb_feed.Remark2
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Remark2
	 * @param remark2  the value for tb_feed.Remark2
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.Remark3
	 * @return  the value of tb_feed.Remark3
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getRemark3() {
		return remark3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.Remark3
	 * @param remark3  the value for tb_feed.Remark3
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_feed.isOfficial
	 * @return  the value of tb_feed.isOfficial
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Boolean getIsofficial() {
		return isofficial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_feed.isOfficial
	 * @param isofficial  the value for tb_feed.isOfficial
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setIsofficial(Boolean isofficial) {
		this.isofficial = isofficial;
	}
}