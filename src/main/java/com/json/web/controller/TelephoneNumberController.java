package com.json.web.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.json.web.entity.TelephoneNumber;
import com.json.web.service.impl.TelephoneNumberService;
import com.json.web.util.JacksonFilterUtil;
import com.json.web.vo.TelephoneNumberVO;

@Controller
@RequestMapping("/json")
public class TelephoneNumberController {

	private static final Logger log = Logger.getLogger(TelephoneNumberController.class);
	@Autowired
	private TelephoneNumberService telephoneNumberService;
	
	/**
	 * localhost:8081/jsondemo/json/insertTelephoneNumber
	 * @param telephoneNumberVO,对象
	 * @return
	 * 20200202
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	@PostMapping(value = "/insertTelephoneNumber",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String  addTelephoneNumber(@RequestBody TelephoneNumberVO telephoneNumberVO) {
		// json对象转json串
		String json = JacksonFilterUtil.beanToJson(telephoneNumberVO);
		try {
			// json串转map
			Map<String, Object> map = JacksonFilterUtil.jsonToMap(json);
			log.info("======reason:" + map.get("reason"));
			log.info("-------error_code:" + map.get("error_code"));
			Map<String, Object> mapResult = (Map<String, Object>) map.get("result");
			// data
			Map<String, Object> mapData = (Map<String, Object>) mapResult.get("data");
			TelephoneNumber telephoneNumber = new TelephoneNumber();
			telephoneNumber.setName((String)mapData.get("name"));
			telephoneNumber.setTeldesc((String)mapData.get("teldesc"));
			telephoneNumber.setTelnum((String)mapData.get("telnum"));
			telephoneNumberService.insert(telephoneNumber);
			// 遍历catnames
			List<String> lsitCatnames = (List<String>) mapData.get("catnames");
			for (String catnames : lsitCatnames) {
				log.info("====catnames:" + catnames);
			}
			// 遍历itag_ids
			List<Map<String, String>> lsitItagIds = (List<Map<String, String>>) mapData.get("itag_ids");
			for (Map<String, String> mapItagIds : lsitItagIds) {
				log.info("financialInformation:" + mapItagIds.get("financialInformation"));
				log.info("thirdParty:" + mapItagIds.get("thirdParty"));
				log.info("networkCredit:" + mapItagIds.get("networkCredit"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}
	
	
}
