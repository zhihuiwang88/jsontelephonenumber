package com.json.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.json.web.dao.TelephoneNumberMapper;
import com.json.web.entity.TelephoneNumber;
import com.json.web.enums.ResultEnum;
import com.json.web.exception.JsonException;

@Service
public class TelephoneNumberServiceImpl implements TelephoneNumberService {

	@Autowired
	private TelephoneNumberMapper telephoneNumberMapper;
	
	/**
	 * 新增
	 * @param record,对象
	 */
	public int insert(TelephoneNumber record) {
		if (StringUtils.isEmpty(record.getTelnum())) {
			throw new JsonException(ResultEnum.TELNUM_IS_NULL);
		}
		return telephoneNumberMapper.insert(record);
	}

}
