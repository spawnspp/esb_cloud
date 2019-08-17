package com.fubon.utils;

import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtils {

	
	public static String doGet(String url) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter("http.protocol.content-charset", "UTF-8");
		HttpGet httpGet = new HttpGet(url);
		try {
			HttpResponse response = httpClient.execute(httpGet);
			String responseString = EntityUtils.toString(response.getEntity());
			return responseString;
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	
	public static String doPost(String url, ArrayList<NameValuePair> pairList) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter("http.protocol.content-charset", "UTF-8");
		HttpPost httpPost = new HttpPost(url);
		try {
			StringEntity entity = new StringEntity(URLEncodedUtils.format(pairList, "UTF-8"));
			httpPost.setEntity(entity);
			HttpResponse response = httpClient.execute(httpPost);
			String responseString = EntityUtils.toString(response.getEntity());
			return responseString;
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
}
