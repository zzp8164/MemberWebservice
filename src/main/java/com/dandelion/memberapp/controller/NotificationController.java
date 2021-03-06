package com.dandelion.memberapp.controller;

import com.dandelion.memberapp.exception.MemberAppException;
import com.dandelion.memberapp.model.bo.NotificationInfo;
import com.dandelion.memberapp.model.po.Member;
import com.dandelion.memberapp.model.po.Notification;
import com.dandelion.memberapp.model.vo.NotificationListResponse;
import com.dandelion.memberapp.model.vo.ResponseResult;
import com.dandelion.memberapp.service.AccountService;
import com.dandelion.memberapp.service.NotificationService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class NotificationController {
	@Autowired
	private NotificationService notificationService;
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value = "/Notifications/Accounts/{id}", method = RequestMethod.GET)
	public ResponseEntity<NotificationListResponse> getNotifications(@RequestParam(value = "j", required = true) String j, @PathVariable Long id)throws  JSONException, MemberAppException {
		NotificationListResponse notificationListResponse = notificationService.getNotifications(id);
		List<NotificationInfo> list = notificationListResponse.getNotificationList();
		for (NotificationInfo notificationInfo : list) {
			long userId = notificationInfo.getFromuseridfk();
			Member member = accountService.getMember(userId);
			notificationInfo.setMember(member);
		}
		return new ResponseEntity<NotificationListResponse>(notificationListResponse, HttpStatus.OK);
	}
	@RequestMapping(value = "/Notifications/{notificationId}/Accounts/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ResponseResult> updateNotification(@RequestParam(value = "j", required = true) String j, @PathVariable Long id, @PathVariable Long notificationId)throws  JSONException, MemberAppException {

		JSONObject json = new JSONObject(j);
		boolean isRead = json.optBoolean("isRead");
		boolean isDeleted = json.optBoolean("isDeleted");
		Notification notification = new Notification();
		notification.setId(notificationId);
		notification.setIsdeleted(isDeleted);
		notification.setIsread(isRead);
		notification.setModifieddate(new Date());
		notificationService.updateNotifications(notification);
		
		return new ResponseEntity<ResponseResult>(HttpStatus.OK);
	}
	
}
