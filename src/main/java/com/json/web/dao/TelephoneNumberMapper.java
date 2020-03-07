package com.json.web.dao;

import com.json.web.entity.TelephoneNumber;
import com.json.web.entity.TelephoneNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TelephoneNumberMapper {
    /**
     * countByExample
     */
    int countByExample(TelephoneNumberExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(TelephoneNumberExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer telephoneId);

    /**
     * insert
     */
    int insert(TelephoneNumber record);

    /**
     * insertSelective
     */
    int insertSelective(TelephoneNumber record);

    /**
     * selectByExample
     */
    List<TelephoneNumber> selectByExample(TelephoneNumberExample example);

    /**
     * selectByPrimaryKey
     */
    TelephoneNumber selectByPrimaryKey(Integer telephoneId);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TelephoneNumber record, @Param("example") TelephoneNumberExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") TelephoneNumber record, @Param("example") TelephoneNumberExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TelephoneNumber record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(TelephoneNumber record);
}