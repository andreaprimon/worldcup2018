/*
 * Name: $RCSfile: SmartLog.java,v $
 * Version: $Revision: 1.1 $
 * Date: $Date: Oct 31, 2011 1:58:08 PM $
 *
 * Copyright (C) 2011 COMPANY_NAME, Inc. All rights reserved.
 */

package com.projectemplate.worldcup2014.utility;

import android.util.Log;

import com.projectemplate.worldcup2014.activity.config.ConfigSmartLog;

public final class SmartLog {
	/**
	 * Call SmartLog.log
	 * 
	 * @param TAG
	 * @param msg
	 */
	public static void log(String TAG, String msg) {
		if (ConfigSmartLog.DEBUG_MODE) {
			Log.d(TAG, msg);
		}
	}

	public static void logWS(String TAG, String msg) {
		if (ConfigSmartLog.DEBUG_WS) {
			Log.w(TAG, msg);
		}
	}

	public static void logDB(String TAG, String msg) {
		if (ConfigSmartLog.DEBUG_DB) {
			Log.e(TAG, msg);
		}
	}

}
