package com.dandelion.memberapp.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public UserExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_user
	 * @mbggenerated  Thu Jan 16 19:58:43 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_user
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

		public Criteria andAliasIsNull() {
			addCriterion("Alias is null");
			return (Criteria) this;
		}

		public Criteria andAliasIsNotNull() {
			addCriterion("Alias is not null");
			return (Criteria) this;
		}

		public Criteria andAliasEqualTo(String value) {
			addCriterion("Alias =", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotEqualTo(String value) {
			addCriterion("Alias <>", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasGreaterThan(String value) {
			addCriterion("Alias >", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasGreaterThanOrEqualTo(String value) {
			addCriterion("Alias >=", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLessThan(String value) {
			addCriterion("Alias <", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLessThanOrEqualTo(String value) {
			addCriterion("Alias <=", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLike(String value) {
			addCriterion("Alias like", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotLike(String value) {
			addCriterion("Alias not like", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasIn(List<String> values) {
			addCriterion("Alias in", values, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotIn(List<String> values) {
			addCriterion("Alias not in", values, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasBetween(String value1, String value2) {
			addCriterion("Alias between", value1, value2, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotBetween(String value1, String value2) {
			addCriterion("Alias not between", value1, value2, "alias");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNull() {
			addCriterion("Password is null");
			return (Criteria) this;
		}

		public Criteria andPasswordIsNotNull() {
			addCriterion("Password is not null");
			return (Criteria) this;
		}

		public Criteria andPasswordEqualTo(String value) {
			addCriterion("Password =", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("Password <>", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("Password >", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("Password >=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThan(String value) {
			addCriterion("Password <", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("Password <=", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordLike(String value) {
			addCriterion("Password like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotLike(String value) {
			addCriterion("Password not like", value, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordIn(List<String> values) {
			addCriterion("Password in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("Password not in", values, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("Password between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("Password not between", value1, value2, "password");
			return (Criteria) this;
		}

		public Criteria andUseremailIsNull() {
			addCriterion("UserEmail is null");
			return (Criteria) this;
		}

		public Criteria andUseremailIsNotNull() {
			addCriterion("UserEmail is not null");
			return (Criteria) this;
		}

		public Criteria andUseremailEqualTo(String value) {
			addCriterion("UserEmail =", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailNotEqualTo(String value) {
			addCriterion("UserEmail <>", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailGreaterThan(String value) {
			addCriterion("UserEmail >", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailGreaterThanOrEqualTo(String value) {
			addCriterion("UserEmail >=", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailLessThan(String value) {
			addCriterion("UserEmail <", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailLessThanOrEqualTo(String value) {
			addCriterion("UserEmail <=", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailLike(String value) {
			addCriterion("UserEmail like", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailNotLike(String value) {
			addCriterion("UserEmail not like", value, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailIn(List<String> values) {
			addCriterion("UserEmail in", values, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailNotIn(List<String> values) {
			addCriterion("UserEmail not in", values, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailBetween(String value1, String value2) {
			addCriterion("UserEmail between", value1, value2, "useremail");
			return (Criteria) this;
		}

		public Criteria andUseremailNotBetween(String value1, String value2) {
			addCriterion("UserEmail not between", value1, value2, "useremail");
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

		public Criteria andIsdeletedIsNull() {
			addCriterion("IsDeleted is null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNotNull() {
			addCriterion("IsDeleted is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedEqualTo(Boolean value) {
			addCriterion("IsDeleted =", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotEqualTo(Boolean value) {
			addCriterion("IsDeleted <>", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThan(Boolean value) {
			addCriterion("IsDeleted >", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("IsDeleted >=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThan(Boolean value) {
			addCriterion("IsDeleted <", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("IsDeleted <=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIn(List<Boolean> values) {
			addCriterion("IsDeleted in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotIn(List<Boolean> values) {
			addCriterion("IsDeleted not in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("IsDeleted between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("IsDeleted not between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andFriendcountIsNull() {
			addCriterion("FriendCount is null");
			return (Criteria) this;
		}

		public Criteria andFriendcountIsNotNull() {
			addCriterion("FriendCount is not null");
			return (Criteria) this;
		}

		public Criteria andFriendcountEqualTo(Integer value) {
			addCriterion("FriendCount =", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountNotEqualTo(Integer value) {
			addCriterion("FriendCount <>", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountGreaterThan(Integer value) {
			addCriterion("FriendCount >", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("FriendCount >=", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountLessThan(Integer value) {
			addCriterion("FriendCount <", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountLessThanOrEqualTo(Integer value) {
			addCriterion("FriendCount <=", value, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountIn(List<Integer> values) {
			addCriterion("FriendCount in", values, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountNotIn(List<Integer> values) {
			addCriterion("FriendCount not in", values, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountBetween(Integer value1, Integer value2) {
			addCriterion("FriendCount between", value1, value2, "friendcount");
			return (Criteria) this;
		}

		public Criteria andFriendcountNotBetween(Integer value1, Integer value2) {
			addCriterion("FriendCount not between", value1, value2,
					"friendcount");
			return (Criteria) this;
		}

		public Criteria andFancountIsNull() {
			addCriterion("FanCount is null");
			return (Criteria) this;
		}

		public Criteria andFancountIsNotNull() {
			addCriterion("FanCount is not null");
			return (Criteria) this;
		}

		public Criteria andFancountEqualTo(Integer value) {
			addCriterion("FanCount =", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountNotEqualTo(Integer value) {
			addCriterion("FanCount <>", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountGreaterThan(Integer value) {
			addCriterion("FanCount >", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountGreaterThanOrEqualTo(Integer value) {
			addCriterion("FanCount >=", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountLessThan(Integer value) {
			addCriterion("FanCount <", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountLessThanOrEqualTo(Integer value) {
			addCriterion("FanCount <=", value, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountIn(List<Integer> values) {
			addCriterion("FanCount in", values, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountNotIn(List<Integer> values) {
			addCriterion("FanCount not in", values, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountBetween(Integer value1, Integer value2) {
			addCriterion("FanCount between", value1, value2, "fancount");
			return (Criteria) this;
		}

		public Criteria andFancountNotBetween(Integer value1, Integer value2) {
			addCriterion("FanCount not between", value1, value2, "fancount");
			return (Criteria) this;
		}

		public Criteria andFollowcountIsNull() {
			addCriterion("FollowCount is null");
			return (Criteria) this;
		}

		public Criteria andFollowcountIsNotNull() {
			addCriterion("FollowCount is not null");
			return (Criteria) this;
		}

		public Criteria andFollowcountEqualTo(Integer value) {
			addCriterion("FollowCount =", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountNotEqualTo(Integer value) {
			addCriterion("FollowCount <>", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountGreaterThan(Integer value) {
			addCriterion("FollowCount >", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("FollowCount >=", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountLessThan(Integer value) {
			addCriterion("FollowCount <", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountLessThanOrEqualTo(Integer value) {
			addCriterion("FollowCount <=", value, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountIn(List<Integer> values) {
			addCriterion("FollowCount in", values, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountNotIn(List<Integer> values) {
			addCriterion("FollowCount not in", values, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountBetween(Integer value1, Integer value2) {
			addCriterion("FollowCount between", value1, value2, "followcount");
			return (Criteria) this;
		}

		public Criteria andFollowcountNotBetween(Integer value1, Integer value2) {
			addCriterion("FollowCount not between", value1, value2,
					"followcount");
			return (Criteria) this;
		}

		public Criteria andArticlecountIsNull() {
			addCriterion("ArticleCount is null");
			return (Criteria) this;
		}

		public Criteria andArticlecountIsNotNull() {
			addCriterion("ArticleCount is not null");
			return (Criteria) this;
		}

		public Criteria andArticlecountEqualTo(Integer value) {
			addCriterion("ArticleCount =", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountNotEqualTo(Integer value) {
			addCriterion("ArticleCount <>", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountGreaterThan(Integer value) {
			addCriterion("ArticleCount >", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountGreaterThanOrEqualTo(Integer value) {
			addCriterion("ArticleCount >=", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountLessThan(Integer value) {
			addCriterion("ArticleCount <", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountLessThanOrEqualTo(Integer value) {
			addCriterion("ArticleCount <=", value, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountIn(List<Integer> values) {
			addCriterion("ArticleCount in", values, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountNotIn(List<Integer> values) {
			addCriterion("ArticleCount not in", values, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountBetween(Integer value1, Integer value2) {
			addCriterion("ArticleCount between", value1, value2, "articlecount");
			return (Criteria) this;
		}

		public Criteria andArticlecountNotBetween(Integer value1, Integer value2) {
			addCriterion("ArticleCount not between", value1, value2,
					"articlecount");
			return (Criteria) this;
		}

		public Criteria andRegisterfromIsNull() {
			addCriterion("RegisterFrom is null");
			return (Criteria) this;
		}

		public Criteria andRegisterfromIsNotNull() {
			addCriterion("RegisterFrom is not null");
			return (Criteria) this;
		}

		public Criteria andRegisterfromEqualTo(Integer value) {
			addCriterion("RegisterFrom =", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromNotEqualTo(Integer value) {
			addCriterion("RegisterFrom <>", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromGreaterThan(Integer value) {
			addCriterion("RegisterFrom >", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromGreaterThanOrEqualTo(Integer value) {
			addCriterion("RegisterFrom >=", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromLessThan(Integer value) {
			addCriterion("RegisterFrom <", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromLessThanOrEqualTo(Integer value) {
			addCriterion("RegisterFrom <=", value, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromIn(List<Integer> values) {
			addCriterion("RegisterFrom in", values, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromNotIn(List<Integer> values) {
			addCriterion("RegisterFrom not in", values, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromBetween(Integer value1, Integer value2) {
			addCriterion("RegisterFrom between", value1, value2, "registerfrom");
			return (Criteria) this;
		}

		public Criteria andRegisterfromNotBetween(Integer value1, Integer value2) {
			addCriterion("RegisterFrom not between", value1, value2,
					"registerfrom");
			return (Criteria) this;
		}

		public Criteria andAccounttypeIsNull() {
			addCriterion("AccountType is null");
			return (Criteria) this;
		}

		public Criteria andAccounttypeIsNotNull() {
			addCriterion("AccountType is not null");
			return (Criteria) this;
		}

		public Criteria andAccounttypeEqualTo(Integer value) {
			addCriterion("AccountType =", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeNotEqualTo(Integer value) {
			addCriterion("AccountType <>", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeGreaterThan(Integer value) {
			addCriterion("AccountType >", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("AccountType >=", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeLessThan(Integer value) {
			addCriterion("AccountType <", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeLessThanOrEqualTo(Integer value) {
			addCriterion("AccountType <=", value, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeIn(List<Integer> values) {
			addCriterion("AccountType in", values, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeNotIn(List<Integer> values) {
			addCriterion("AccountType not in", values, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeBetween(Integer value1, Integer value2) {
			addCriterion("AccountType between", value1, value2, "accounttype");
			return (Criteria) this;
		}

		public Criteria andAccounttypeNotBetween(Integer value1, Integer value2) {
			addCriterion("AccountType not between", value1, value2,
					"accounttype");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkIsNull() {
			addCriterion("merchantIDFK is null");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkIsNotNull() {
			addCriterion("merchantIDFK is not null");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkEqualTo(Long value) {
			addCriterion("merchantIDFK =", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkNotEqualTo(Long value) {
			addCriterion("merchantIDFK <>", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkGreaterThan(Long value) {
			addCriterion("merchantIDFK >", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkGreaterThanOrEqualTo(Long value) {
			addCriterion("merchantIDFK >=", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkLessThan(Long value) {
			addCriterion("merchantIDFK <", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkLessThanOrEqualTo(Long value) {
			addCriterion("merchantIDFK <=", value, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkIn(List<Long> values) {
			addCriterion("merchantIDFK in", values, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkNotIn(List<Long> values) {
			addCriterion("merchantIDFK not in", values, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkBetween(Long value1, Long value2) {
			addCriterion("merchantIDFK between", value1, value2, "merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMerchantidfkNotBetween(Long value1, Long value2) {
			addCriterion("merchantIDFK not between", value1, value2,
					"merchantidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkIsNull() {
			addCriterion("memberIDFK is null");
			return (Criteria) this;
		}

		public Criteria andMemberidfkIsNotNull() {
			addCriterion("memberIDFK is not null");
			return (Criteria) this;
		}

		public Criteria andMemberidfkEqualTo(Long value) {
			addCriterion("memberIDFK =", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkNotEqualTo(Long value) {
			addCriterion("memberIDFK <>", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkGreaterThan(Long value) {
			addCriterion("memberIDFK >", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkGreaterThanOrEqualTo(Long value) {
			addCriterion("memberIDFK >=", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkLessThan(Long value) {
			addCriterion("memberIDFK <", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkLessThanOrEqualTo(Long value) {
			addCriterion("memberIDFK <=", value, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkIn(List<Long> values) {
			addCriterion("memberIDFK in", values, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkNotIn(List<Long> values) {
			addCriterion("memberIDFK not in", values, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkBetween(Long value1, Long value2) {
			addCriterion("memberIDFK between", value1, value2, "memberidfk");
			return (Criteria) this;
		}

		public Criteria andMemberidfkNotBetween(Long value1, Long value2) {
			addCriterion("memberIDFK not between", value1, value2, "memberidfk");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_user
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
     * This class corresponds to the database table tb_user
     *
     * @mbggenerated do_not_delete_during_merge Sat Oct 26 13:40:24 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}