package com.projectemplate.worldcup2014.modelmanager;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.projectemplate.worldcup2014.activity.config.MySharedPreferences;
import com.projectemplate.worldcup2014.activity.config.WebServiceConfig;
import com.projectemplate.worldcup2014.database.DatabaseUtility;
import com.projectemplate.worldcup2014.network.AsyncHttpGet;
import com.projectemplate.worldcup2014.network.AsyncHttpResponseProcess;
import com.projectemplate.worldcup2014.object.JsonOffline;

/**
 * 
 * @author Mr.Lemon
 * 
 * @Description : Class to manage all model object
 * 
 */

public class ModelManager {

	static String TAG = "ModelManager";

	public static void getData(final Activity activity, boolean showLoading,
			final String url, final ModelManagerListener listener) {

		AsyncHttpGet get = new AsyncHttpGet(activity,
				new AsyncHttpResponseProcess(activity) {
					@Override
					public void processIfResponseSuccess(String response) {
						if (response != null) {
							if (!DatabaseUtility.checkExistsJson(activity, url)) {
								JsonOffline json = new JsonOffline(url,
										response);
								DatabaseUtility.insertJson(activity, json);
							}
							listener.OnSuccess(response);

						} else {
							listener.OnSuccess(DatabaseUtility.getJsonContent(
									activity, url));
						}
					}
				}, new ArrayList<NameValuePair>(), showLoading);
		get.execute(url);
	}

	public static void postRegistratrionId(Context context,
			final String registrationId, boolean showLoading) {
		final MySharedPreferences preferences = new MySharedPreferences(context);
		String oldRegistrationId = preferences.getRegistrationId();
		// Log.e("OLD","oldaaaaaa "+oldRegistrationId);
		if (!oldRegistrationId.equals(registrationId)) {
			List<NameValuePair> param = ParameterFactory
					.createRegistrationIdParams(context, registrationId);
			AsyncHttpGet get = new AsyncHttpGet(context,
					new AsyncHttpResponseProcess(context) {
						@Override
						public void processIfResponseSuccess(String response) {
							Log.e("Response", "response_aaa " + response);
							preferences.putRegistrationId(registrationId);
							Log.e("REGIS", "regisaaaaaa " + registrationId);
						}
					}, param, showLoading);
			get.execute(WebServiceConfig.URL_REGISTER_DEVICE);
		}
	}
}
