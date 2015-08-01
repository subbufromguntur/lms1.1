package com.rms.loyalty.beans;

import java.util.List;

public class OrganizationDataLoader {

	private List<String> parentList = null;
	private List<String> type = null;
	private List<String> category = null;
	private List<String> glAccountType = null;

	public List<String> getParentList() {
		return parentList;
	}

	public void setParentList(List<String> parentList) {
		this.parentList = parentList;
	}

	public List<String> getType() {
		return type;
	}

	public void setType(List<String> type) {
		this.type = type;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public List<String> getGlAccountType() {
		return glAccountType;
	}

	public void setGlAccountType(List<String> glAccountType) {
		this.glAccountType = glAccountType;
	}

}
