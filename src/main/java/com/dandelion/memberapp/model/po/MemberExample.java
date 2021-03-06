package com.dandelion.memberapp.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public MemberExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUseridfkIsNull() {
			addCriterion("UserIDFK is null");
			return (Criteria) this;
		}

		public Criteria andUseridfkIsNotNull() {
			addCriterion("UserIDFK is not null");
			return (Criteria) this;
		}

		public Criteria andUseridfkEqualTo(Long value) {
			addCriterion("UserIDFK =", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotEqualTo(Long value) {
			addCriterion("UserIDFK <>", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkGreaterThan(Long value) {
			addCriterion("UserIDFK >", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkGreaterThanOrEqualTo(Long value) {
			addCriterion("UserIDFK >=", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkLessThan(Long value) {
			addCriterion("UserIDFK <", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkLessThanOrEqualTo(Long value) {
			addCriterion("UserIDFK <=", value, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkIn(List<Long> values) {
			addCriterion("UserIDFK in", values, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotIn(List<Long> values) {
			addCriterion("UserIDFK not in", values, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkBetween(Long value1, Long value2) {
			addCriterion("UserIDFK between", value1, value2, "useridfk");
			return (Criteria) this;
		}

		public Criteria andUseridfkNotBetween(Long value1, Long value2) {
			addCriterion("UserIDFK not between", value1, value2, "useridfk");
			return (Criteria) this;
		}

		public Criteria andAvatarurlIsNull() {
			addCriterion("AvatarUrl is null");
			return (Criteria) this;
		}

		public Criteria andAvatarurlIsNotNull() {
			addCriterion("AvatarUrl is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarurlEqualTo(String value) {
			addCriterion("AvatarUrl =", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlNotEqualTo(String value) {
			addCriterion("AvatarUrl <>", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlGreaterThan(String value) {
			addCriterion("AvatarUrl >", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlGreaterThanOrEqualTo(String value) {
			addCriterion("AvatarUrl >=", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlLessThan(String value) {
			addCriterion("AvatarUrl <", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlLessThanOrEqualTo(String value) {
			addCriterion("AvatarUrl <=", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlLike(String value) {
			addCriterion("AvatarUrl like", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlNotLike(String value) {
			addCriterion("AvatarUrl not like", value, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlIn(List<String> values) {
			addCriterion("AvatarUrl in", values, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlNotIn(List<String> values) {
			addCriterion("AvatarUrl not in", values, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlBetween(String value1, String value2) {
			addCriterion("AvatarUrl between", value1, value2, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andAvatarurlNotBetween(String value1, String value2) {
			addCriterion("AvatarUrl not between", value1, value2, "avatarurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlIsNull() {
			addCriterion("BackgroundUrl is null");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlIsNotNull() {
			addCriterion("BackgroundUrl is not null");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlEqualTo(String value) {
			addCriterion("BackgroundUrl =", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlNotEqualTo(String value) {
			addCriterion("BackgroundUrl <>", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlGreaterThan(String value) {
			addCriterion("BackgroundUrl >", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlGreaterThanOrEqualTo(String value) {
			addCriterion("BackgroundUrl >=", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlLessThan(String value) {
			addCriterion("BackgroundUrl <", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlLessThanOrEqualTo(String value) {
			addCriterion("BackgroundUrl <=", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlLike(String value) {
			addCriterion("BackgroundUrl like", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlNotLike(String value) {
			addCriterion("BackgroundUrl not like", value, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlIn(List<String> values) {
			addCriterion("BackgroundUrl in", values, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlNotIn(List<String> values) {
			addCriterion("BackgroundUrl not in", values, "backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlBetween(String value1, String value2) {
			addCriterion("BackgroundUrl between", value1, value2,
					"backgroundurl");
			return (Criteria) this;
		}

		public Criteria andBackgroundurlNotBetween(String value1, String value2) {
			addCriterion("BackgroundUrl not between", value1, value2,
					"backgroundurl");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("Name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("Name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("Name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("Name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("Name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("Name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("Name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("Name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("Name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("Name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("Name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("Name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("Name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("Name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("Sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("Sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(Integer value) {
			addCriterion("Sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(Integer value) {
			addCriterion("Sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(Integer value) {
			addCriterion("Sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(Integer value) {
			addCriterion("Sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(Integer value) {
			addCriterion("Sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(Integer value) {
			addCriterion("Sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<Integer> values) {
			addCriterion("Sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<Integer> values) {
			addCriterion("Sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(Integer value1, Integer value2) {
			addCriterion("Sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(Integer value1, Integer value2) {
			addCriterion("Sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNull() {
			addCriterion("Birthday is null");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNotNull() {
			addCriterion("Birthday is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdayEqualTo(Date value) {
			addCriterion("Birthday =", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotEqualTo(Date value) {
			addCriterion("Birthday <>", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThan(Date value) {
			addCriterion("Birthday >", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
			addCriterion("Birthday >=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThan(Date value) {
			addCriterion("Birthday <", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThanOrEqualTo(Date value) {
			addCriterion("Birthday <=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayIn(List<Date> values) {
			addCriterion("Birthday in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotIn(List<Date> values) {
			addCriterion("Birthday not in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayBetween(Date value1, Date value2) {
			addCriterion("Birthday between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotBetween(Date value1, Date value2) {
			addCriterion("Birthday not between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("Address is null");
			return (Criteria) this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("Address is not null");
			return (Criteria) this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("Address =", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("Address <>", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("Address >", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("Address >=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("Address <", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("Address <=", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("Address like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("Address not like", value, "address");
			return (Criteria) this;
		}

		public Criteria andAddressIn(List<String> values) {
			addCriterion("Address in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("Address not in", values, "address");
			return (Criteria) this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("Address between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("Address not between", value1, value2, "address");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("Phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("Phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("Phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("Phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("Phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("Phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("Phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("Phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("Phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("Phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("Phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("Phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("Phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("Phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNull() {
			addCriterion("Introduction is null");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNotNull() {
			addCriterion("Introduction is not null");
			return (Criteria) this;
		}

		public Criteria andIntroductionEqualTo(String value) {
			addCriterion("Introduction =", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotEqualTo(String value) {
			addCriterion("Introduction <>", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThan(String value) {
			addCriterion("Introduction >", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
			addCriterion("Introduction >=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThan(String value) {
			addCriterion("Introduction <", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThanOrEqualTo(String value) {
			addCriterion("Introduction <=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLike(String value) {
			addCriterion("Introduction like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotLike(String value) {
			addCriterion("Introduction not like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionIn(List<String> values) {
			addCriterion("Introduction in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotIn(List<String> values) {
			addCriterion("Introduction not in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionBetween(String value1, String value2) {
			addCriterion("Introduction between", value1, value2, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotBetween(String value1, String value2) {
			addCriterion("Introduction not between", value1, value2,
					"introduction");
			return (Criteria) this;
		}

		public Criteria andCreateddateIsNull() {
			addCriterion("CreatedDate is null");
			return (Criteria) this;
		}

		public Criteria andCreateddateIsNotNull() {
			addCriterion("CreatedDate is not null");
			return (Criteria) this;
		}

		public Criteria andCreateddateEqualTo(Date value) {
			addCriterion("CreatedDate =", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotEqualTo(Date value) {
			addCriterion("CreatedDate <>", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateGreaterThan(Date value) {
			addCriterion("CreatedDate >", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
			addCriterion("CreatedDate >=", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateLessThan(Date value) {
			addCriterion("CreatedDate <", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateLessThanOrEqualTo(Date value) {
			addCriterion("CreatedDate <=", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateIn(List<Date> values) {
			addCriterion("CreatedDate in", values, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotIn(List<Date> values) {
			addCriterion("CreatedDate not in", values, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateBetween(Date value1, Date value2) {
			addCriterion("CreatedDate between", value1, value2, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotBetween(Date value1, Date value2) {
			addCriterion("CreatedDate not between", value1, value2,
					"createddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateIsNull() {
			addCriterion("ModifiedDate is null");
			return (Criteria) this;
		}

		public Criteria andModifieddateIsNotNull() {
			addCriterion("ModifiedDate is not null");
			return (Criteria) this;
		}

		public Criteria andModifieddateEqualTo(Date value) {
			addCriterion("ModifiedDate =", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotEqualTo(Date value) {
			addCriterion("ModifiedDate <>", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateGreaterThan(Date value) {
			addCriterion("ModifiedDate >", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
			addCriterion("ModifiedDate >=", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateLessThan(Date value) {
			addCriterion("ModifiedDate <", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateLessThanOrEqualTo(Date value) {
			addCriterion("ModifiedDate <=", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateIn(List<Date> values) {
			addCriterion("ModifiedDate in", values, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotIn(List<Date> values) {
			addCriterion("ModifiedDate not in", values, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateBetween(Date value1, Date value2) {
			addCriterion("ModifiedDate between", value1, value2, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotBetween(Date value1, Date value2) {
			addCriterion("ModifiedDate not between", value1, value2,
					"modifieddate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_member
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_member
     *
     * @mbggenerated do_not_delete_during_merge Mon Dec 16 21:27:17 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}