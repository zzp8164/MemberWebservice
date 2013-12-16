package com.dandelion.memberapp.dao.data;

import com.dandelion.memberapp.model.po.Member;
import com.dandelion.memberapp.model.po.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    Member selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_member
     *
     * @mbggenerated Mon Dec 16 21:27:17 CST 2013
     */
    int updateByPrimaryKey(Member record);
}