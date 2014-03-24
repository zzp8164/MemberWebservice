package com.dandelion.memberapp.model.po;

import java.util.Date;

public class Member {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Long useridfk;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.AvatarUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String avatarurl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.BackgroundUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String backgroundurl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Name
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Sex
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Integer sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Birthday
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Date birthday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Address
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Phone
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.Introduction
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private String introduction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Date createddate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tb_member.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	private Date modifieddate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.ID
	 * @return  the value of tb_member.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.ID
	 * @param id  the value for tb_member.ID
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.UserIDFK
	 * @return  the value of tb_member.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Long getUseridfk() {
		return useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.UserIDFK
	 * @param useridfk  the value for tb_member.UserIDFK
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setUseridfk(Long useridfk) {
		this.useridfk = useridfk;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.AvatarUrl
	 * @return  the value of tb_member.AvatarUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getAvatarurl() {
		return avatarurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.AvatarUrl
	 * @param avatarurl  the value for tb_member.AvatarUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setAvatarurl(String avatarurl) {
		this.avatarurl = avatarurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.BackgroundUrl
	 * @return  the value of tb_member.BackgroundUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getBackgroundurl() {
		return backgroundurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.BackgroundUrl
	 * @param backgroundurl  the value for tb_member.BackgroundUrl
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setBackgroundurl(String backgroundurl) {
		this.backgroundurl = backgroundurl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Name
	 * @return  the value of tb_member.Name
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Name
	 * @param name  the value for tb_member.Name
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Sex
	 * @return  the value of tb_member.Sex
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Sex
	 * @param sex  the value for tb_member.Sex
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Birthday
	 * @return  the value of tb_member.Birthday
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Birthday
	 * @param birthday  the value for tb_member.Birthday
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Address
	 * @return  the value of tb_member.Address
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Address
	 * @param address  the value for tb_member.Address
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Phone
	 * @return  the value of tb_member.Phone
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Phone
	 * @param phone  the value for tb_member.Phone
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.Introduction
	 * @return  the value of tb_member.Introduction
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.Introduction
	 * @param introduction  the value for tb_member.Introduction
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.CreatedDate
	 * @return  the value of tb_member.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Date getCreateddate() {
		return createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.CreatedDate
	 * @param createddate  the value for tb_member.CreatedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tb_member.ModifiedDate
	 * @return  the value of tb_member.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Date getModifieddate() {
		return modifieddate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tb_member.ModifiedDate
	 * @param modifieddate  the value for tb_member.ModifiedDate
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
}