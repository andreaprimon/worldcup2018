package com.projectemplate.worldcup2014.database.binder;

import android.database.sqlite.SQLiteStatement;

import com.projectemplate.worldcup2014.object.Group;

public class GroupInfoBinder implements ParameterBinder{

	@Override
	public void bind(SQLiteStatement st, Object object) {
		Group groupInfo = (Group) object;
		st.bindLong(1, groupInfo.getGroupId());
		st.bindString(2, groupInfo.getGroupName());
	}

}
