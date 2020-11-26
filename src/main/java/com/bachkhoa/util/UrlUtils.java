package com.bachkhoa.util;

import com.bachkhoa.constant.SystemConstant;

public class UrlUtils {

	public static boolean checkExistUrl(String url) {
		boolean result = false;
		for (int i = 0; i < SystemConstant.LIST_URL.length; i++) {
			if (url.equals(SystemConstant.LIST_URL[i])) {
				result = true;
				break;
			}
		}
		if(!result){
			for (int i = 0; i < SystemConstant.LIST_URL_PARTEN.length; i++) {
				if (url.matches(SystemConstant.LIST_URL_PARTEN[i])) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
}
