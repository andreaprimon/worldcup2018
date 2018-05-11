package com.projectemplate.worldcup2014.database.mapper;

import android.database.Cursor;

import com.projectemplate.worldcup2014.database.DBKeyConfig;
import com.projectemplate.worldcup2014.object.JsonOffline;

public class JsonofflineMapper implements RowMapper<JsonOffline> {

	@Override
	public JsonOffline mapRow(Cursor row, int rowNum) {

		JsonOffline groupInfo = new JsonOffline();
		groupInfo.setLink(CursorParseUtility.getString(row,
				DBKeyConfig.KEY_JSON_LINK));
		groupInfo.setContent(CursorParseUtility.getString(row,
				DBKeyConfig.KEY_JSON_CONTENT));
		return groupInfo;
	}

}
