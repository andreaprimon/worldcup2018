package com.projectemplate.worldcup2014.modelmanager;

public interface ModelManagerListener {

	public void onWSError();

	public void OnSuccess(String json);
}
