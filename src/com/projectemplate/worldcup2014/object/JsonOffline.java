package com.projectemplate.worldcup2014.object;

public class JsonOffline {

	private String link;
	private String content;

	public JsonOffline() {
	}

	public JsonOffline(String link, String content) {
		super();
		this.link = link;
		this.content = content;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
