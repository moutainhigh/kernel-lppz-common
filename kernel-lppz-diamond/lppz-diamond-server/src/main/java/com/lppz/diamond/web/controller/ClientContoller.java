package com.lppz.diamond.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lppz.diamond.netty.DiamondServerHandler;
import com.lppz.diamond.netty.DiamondServerHandler.ClientInfo;
import com.lppz.diamond.netty.DiamondServerHandler.ClientKey;

@Controller
public class ClientContoller extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(ClientContoller.class);
	private static final String DATEFORMAT_STRING = "yyyy-MM-dd HH:mm:ss";
	
	@RequestMapping("/queryClients")
	public void queryClients(ModelMap modelMap) {
		List<Map<String, String>> clients = new ArrayList<Map<String, String>>();
		for(Entry<ClientKey, List<ClientInfo>> entry : DiamondServerHandler.clients.entrySet()) {
			ClientKey key = entry.getKey();
			String projcode = key.getProjCode();
			String modules = StringUtils.join(key.getModuleArr());
			String profile = key.getProfile();
			
			for(ClientInfo info : entry.getValue()) {
				if (info != null && info.getAddress() != null) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("projcode", projcode);
					map.put("modules", modules);
					map.put("profile", profile);
					map.put("address", info.getAddress().substring(1));
					map.put("connectTime", new SimpleDateFormat(DATEFORMAT_STRING).format(info.getConnectTime()));
					clients.add(map);
				}else{
					logger.warn("clientInfo is empty {},{}",key,info==null?null:(info.getAddress() + " " + info.getConnectTime()));
				}
			}
		}
		
		modelMap.addAttribute("clients", clients);
	}
}
