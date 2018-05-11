package com.projectemplate.worldcup2014.database.binder;

import android.database.sqlite.SQLiteStatement;

import com.projectemplate.worldcup2014.object.JsonOffline;

public class JsonOfflineBinder implements ParameterBinder{

	@Override
	public void bind(SQLiteStatement st, Object object) {
		JsonOffline groupInfo = (JsonOffline) object;
		st.bindString(1, groupInfo.getLink());
		st.bindString(2, groupInfo.getContent());
	}

}
