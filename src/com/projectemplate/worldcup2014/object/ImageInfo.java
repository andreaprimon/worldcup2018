package com.projectemplate.worldcup2014.object;

public class ImageInfo {
	private String countryName;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	private String countryCode;
	private int imageId;
	public ImageInfo(String countryName, String countryCode, int imageId) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.imageId = imageId;
	}
	
	
}


