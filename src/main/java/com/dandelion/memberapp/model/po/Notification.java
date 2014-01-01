package com.dandelion.memberapp.model.po;

import java.util.Date;

public class Notification {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.ID
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.FromUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Long fromuseridfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.ToUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Long touseridfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.Content
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.IsRead
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Boolean isread;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.IsDeleted
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Boolean isdeleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.CreatedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Date createddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.ModifiedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Date modifieddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_notification.Sort
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	private Integer sort;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.ID
	 * @return  the value of tb_notification.ID
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.ID
	 * @param id  the value for tb_notification.ID
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.FromUserIDFK
	 * @return  the value of tb_notification.FromUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Long getFromuseridfk() {
		return fromuseridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.FromUserIDFK
	 * @param fromuseridfk  the value for tb_notification.FromUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setFromuseridfk(Long fromuseridfk) {
		this.fromuseridfk = fromuseridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.ToUserIDFK
	 * @return  the value of tb_notification.ToUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Long getTouseridfk() {
		return touseridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.ToUserIDFK
	 * @param touseridfk  the value for tb_notification.ToUserIDFK
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setTouseridfk(Long touseridfk) {
		this.touseridfk = touseridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.Content
	 * @return  the value of tb_notification.Content
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.Content
	 * @param content  the value for tb_notification.Content
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.IsRead
	 * @return  the value of tb_notification.IsRead
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Boolean getIsread() {
		return isread;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.IsRead
	 * @param isread  the value for tb_notification.IsRead
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setIsread(Boolean isread) {
		this.isread = isread;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.IsDeleted
	 * @return  the value of tb_notification.IsDeleted
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Boolean getIsdeleted() {
		return isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.IsDeleted
	 * @param isdeleted  the value for tb_notification.IsDeleted
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.CreatedDate
	 * @return  the value of tb_notification.CreatedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Date getCreateddate() {
		return createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.CreatedDate
	 * @param createddate  the value for tb_notification.CreatedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.ModifiedDate
	 * @return  the value of tb_notification.ModifiedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Date getModifieddate() {
		return modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.ModifiedDate
	 * @param modifieddate  the value for tb_notification.ModifiedDate
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_notification.Sort
	 * @return  the value of tb_notification.Sort
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public Integer getSort() {
		return sort;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_notification.Sort
	 * @param sort  the value for tb_notification.Sort
	 * @mbggenerated  Wed Jan 01 10:48:24 CST 2014
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
}