/**
 * 
 */
package com.web.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * WebSampleController.<br>
 * SpringBoot + Jsp のサンプル.<br>
 * 必須パラメータ不足の例外のハンドリングのサンプル.<br>
 * 
 * @author shinya
 *
 */
@Controller
public class WebSampleController {

	private static final Log log = LogFactory.getLog(WebSampleController.class);

	@RequestMapping(path = "/index", method = { RequestMethod.GET, RequestMethod.POST })
	public String index(Model model) {
		log.debug("index.");
		return "index";
	}
	
	@RequestMapping(path = "/device/user", method = { RequestMethod.GET, RequestMethod.POST })
	public String doGet(Model model,
			@RequestParam(name = "userId", required = true) String userId,
			@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "divisionCd", required = true) String divisionCd,
			@RequestParam(name = "departmentCd", required = true) String departmentCd,
			@RequestParam(name = "deviceCd", required = false) String deviceCd,
			@RequestParam(name = "imei", required = false) String imei,
			@RequestParam(name = "dstUserId", required = false) String dstUserId,
			@RequestParam(name = "dstGroupCd", required = false) String dstGroupCd,
			@RequestParam(name = "groupWhileCd", required = true) String groupWhileCd) {

		logger(userId, userName, divisionCd, departmentCd, deviceCd, imei, dstUserId, dstGroupCd, groupWhileCd);
		setModel(model, userId, userName, divisionCd, departmentCd, deviceCd, imei, dstUserId, dstGroupCd, groupWhileCd);

		return "index";

	}

	@RequestMapping(path = "/pc/user", method = RequestMethod.POST)
	public String doPost(Model model,
			@RequestParam(name = "userId", required = true) String userId,
			@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "divisionCd", required = true) String divisionCd,
			@RequestParam(name = "departmentCd", required = true) String departmentCd,
			@RequestParam(name = "deviceCd", required = false) String deviceCd,
			@RequestParam(name = "imei", required = false) String imei,
			@RequestParam(name = "dstUserId", required = false) String dstUserId,
			@RequestParam(name = "dstGroupCd", required = false) String dstGroupCd,
			@RequestParam(name = "groupWhileCd", required = true) String groupWhileCd) {

		logger(userId, userName, divisionCd, departmentCd, deviceCd, imei, dstUserId, dstGroupCd, groupWhileCd);
		setModel(model, userId, userName, divisionCd, departmentCd, deviceCd, imei, dstUserId, dstGroupCd, groupWhileCd);
		return "index";

	}
	
	@ResponseStatus(HttpStatus.OK)
	@ExceptionHandler({MissingServletRequestParameterException.class})
	@ResponseBody
	public String handleError() {
		return "{\"status\":\"200\"}";
	}
	
	private void setModel(Model model, String userId, String userName, String divisionCd, String departmentCd, String deviceCd,
			String imei, String dstUserId, String dstGroupCd, String groupWhileCd) {
		model.addAttribute("userId", userId);
		model.addAttribute("userName", userName);
		model.addAttribute("divisionCd", divisionCd);
		model.addAttribute("departmentCd", departmentCd);
		model.addAttribute("deviceCd", deviceCd);
		model.addAttribute("imei", imei);
		model.addAttribute("dstUserId", dstUserId);
		model.addAttribute("dstGroupCd", dstGroupCd);
		model.addAttribute("groupWhileCd", groupWhileCd);
		
	}
	
	private void logger(String userId, String userName, String divisionCd, String departmentCd, String deviceCd,
			String imei, String dstUserId, String dstGroupCd, String groupWhileCd) {
		log.info("userId=" + userId + " userName=" + userName + " divisionCd=" + divisionCd + " departmentCd="
				+ departmentCd + " deviceCd=" + deviceCd + " imei=" + imei + " dstUserId=" + dstUserId + " dstGroupCd="
				+ dstGroupCd + " groupWhileCd=" + groupWhileCd);
	}

}
