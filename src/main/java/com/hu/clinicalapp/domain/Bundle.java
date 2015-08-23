/**
 * 
 */
package com.hu.clinicalapp.domain;

/**
 * @author AllSa002
 * 
 */
public class Bundle {

	Integer type;
	Long id;
	Integer group;

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the group
	 */
	public Integer getGroup() {
		return group;
	}

	/**
	 * @param group
	 *            the group to set
	 */
	public void setGroup(Integer group) {
		this.group = group;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bundle [type=");
		builder.append(type);
		builder.append(", id=");
		builder.append(id);
		builder.append(", group=");
		builder.append(group);
		builder.append("]");
		return builder.toString();
	}

}
