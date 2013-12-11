package com.dandelion.memberapp.dao.data;

import com.dandelion.memberapp.model.po.Feed;
import com.dandelion.memberapp.model.po.FeedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int countByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int deleteByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int insert(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int insertSelective(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    List<Feed> selectByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    Feed selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int updateByExampleSelective(@Param("record") Feed record, @Param("example") FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int updateByExample(@Param("record") Feed record, @Param("example") FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int updateByPrimaryKeySelective(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_feed
     *
     * @mbggenerated Mon Nov 25 11:34:32 CST 2013
     */
    int updateByPrimaryKey(Feed record);
}