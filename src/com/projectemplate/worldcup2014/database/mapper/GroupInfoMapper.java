package com.projectemplate.worldcup2014.database.mapper;

import android.database.Cursor;

import com.projectemplate.worldcup2014.database.DBKeyConfig;
import com.projectemplate.worldcup2014.object.Group;

public class GroupInfoMapper implements RowMapper<Group>{

	@Override
	public Group mapRow(Cursor row, int rowNum) {
		
		Group groupInfo = new Group();
		groupInfo.setGroupId(CursorParseUtility.getInt(row, DBKeyConfig.KEY_GROUP_ID));
		groupInfo.setGroupName(CursorParseUtility.getString(row, DBKeyConfig.KEY_GROUP_NAME));
		return groupInfo;
	}

}
