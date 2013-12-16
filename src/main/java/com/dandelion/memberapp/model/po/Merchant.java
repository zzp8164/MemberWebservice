package com.dandelion.memberapp.model.po;

import java.util.Date;

public class Merchant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.ID
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.AvatarUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String avatarurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.Name
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.Address
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.Phone
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.Email
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.MerchantType
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String merchanttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.Introduction
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String introduction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.NameRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean namerequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.SexRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean sexrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.PhoneRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean phonerequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.AddressRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean addressrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.EmailRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean emailrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.BirthdayRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean birthdayrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.MemberSetting
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean membersetting;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.AmountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Integer amountrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.AmountCountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String amountcountrequired;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.ScorePlay
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Boolean scoreplay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.CreatedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Date createddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.ModifiedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Date modifieddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.UserIDFK
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private Long useridfk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_merchant.BackgroundUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    private String backgroundurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.ID
     *
     * @return the value of tb_merchant.ID
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.ID
     *
     * @param id the value for tb_merchant.ID
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.AvatarUrl
     *
     * @return the value of tb_merchant.AvatarUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getAvatarurl() {
        return avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.AvatarUrl
     *
     * @param avatarurl the value for tb_merchant.AvatarUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.Name
     *
     * @return the value of tb_merchant.Name
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.Name
     *
     * @param name the value for tb_merchant.Name
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.Address
     *
     * @return the value of tb_merchant.Address
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.Address
     *
     * @param address the value for tb_merchant.Address
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.Phone
     *
     * @return the value of tb_merchant.Phone
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.Phone
     *
     * @param phone the value for tb_merchant.Phone
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.Email
     *
     * @return the value of tb_merchant.Email
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.Email
     *
     * @param email the value for tb_merchant.Email
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.MerchantType
     *
     * @return the value of tb_merchant.MerchantType
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getMerchanttype() {
        return merchanttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.MerchantType
     *
     * @param merchanttype the value for tb_merchant.MerchantType
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setMerchanttype(String merchanttype) {
        this.merchanttype = merchanttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.Introduction
     *
     * @return the value of tb_merchant.Introduction
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.Introduction
     *
     * @param introduction the value for tb_merchant.Introduction
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.NameRequired
     *
     * @return the value of tb_merchant.NameRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getNamerequired() {
        return namerequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.NameRequired
     *
     * @param namerequired the value for tb_merchant.NameRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setNamerequired(Boolean namerequired) {
        this.namerequired = namerequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.SexRequired
     *
     * @return the value of tb_merchant.SexRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getSexrequired() {
        return sexrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.SexRequired
     *
     * @param sexrequired the value for tb_merchant.SexRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setSexrequired(Boolean sexrequired) {
        this.sexrequired = sexrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.PhoneRequired
     *
     * @return the value of tb_merchant.PhoneRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getPhonerequired() {
        return phonerequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.PhoneRequired
     *
     * @param phonerequired the value for tb_merchant.PhoneRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setPhonerequired(Boolean phonerequired) {
        this.phonerequired = phonerequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.AddressRequired
     *
     * @return the value of tb_merchant.AddressRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getAddressrequired() {
        return addressrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.AddressRequired
     *
     * @param addressrequired the value for tb_merchant.AddressRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setAddressrequired(Boolean addressrequired) {
        this.addressrequired = addressrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.EmailRequired
     *
     * @return the value of tb_merchant.EmailRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getEmailrequired() {
        return emailrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.EmailRequired
     *
     * @param emailrequired the value for tb_merchant.EmailRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setEmailrequired(Boolean emailrequired) {
        this.emailrequired = emailrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.BirthdayRequired
     *
     * @return the value of tb_merchant.BirthdayRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getBirthdayrequired() {
        return birthdayrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.BirthdayRequired
     *
     * @param birthdayrequired the value for tb_merchant.BirthdayRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setBirthdayrequired(Boolean birthdayrequired) {
        this.birthdayrequired = birthdayrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.MemberSetting
     *
     * @return the value of tb_merchant.MemberSetting
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getMembersetting() {
        return membersetting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.MemberSetting
     *
     * @param membersetting the value for tb_merchant.MemberSetting
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setMembersetting(Boolean membersetting) {
        this.membersetting = membersetting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.AmountRequired
     *
     * @return the value of tb_merchant.AmountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Integer getAmountrequired() {
        return amountrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.AmountRequired
     *
     * @param amountrequired the value for tb_merchant.AmountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setAmountrequired(Integer amountrequired) {
        this.amountrequired = amountrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.AmountCountRequired
     *
     * @return the value of tb_merchant.AmountCountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getAmountcountrequired() {
        return amountcountrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.AmountCountRequired
     *
     * @param amountcountrequired the value for tb_merchant.AmountCountRequired
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setAmountcountrequired(String amountcountrequired) {
        this.amountcountrequired = amountcountrequired;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.ScorePlay
     *
     * @return the value of tb_merchant.ScorePlay
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Boolean getScoreplay() {
        return scoreplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.ScorePlay
     *
     * @param scoreplay the value for tb_merchant.ScorePlay
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setScoreplay(Boolean scoreplay) {
        this.scoreplay = scoreplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.CreatedDate
     *
     * @return the value of tb_merchant.CreatedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.CreatedDate
     *
     * @param createddate the value for tb_merchant.CreatedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.ModifiedDate
     *
     * @return the value of tb_merchant.ModifiedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Date getModifieddate() {
        return modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.ModifiedDate
     *
     * @param modifieddate the value for tb_merchant.ModifiedDate
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.UserIDFK
     *
     * @return the value of tb_merchant.UserIDFK
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public Long getUseridfk() {
        return useridfk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.UserIDFK
     *
     * @param useridfk the value for tb_merchant.UserIDFK
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setUseridfk(Long useridfk) {
        this.useridfk = useridfk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_merchant.BackgroundUrl
     *
     * @return the value of tb_merchant.BackgroundUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public String getBackgroundurl() {
        return backgroundurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_merchant.BackgroundUrl
     *
     * @param backgroundurl the value for tb_merchant.BackgroundUrl
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    public void setBackgroundurl(String backgroundurl) {
        this.backgroundurl = backgroundurl;
    }
}