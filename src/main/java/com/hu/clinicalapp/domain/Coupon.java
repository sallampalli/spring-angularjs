/**
 * 
 */
package com.hu.clinicalapp.domain;

/**
 * @author AllSa002
 * 
 */
public class Coupon {

	String couponCode;
	Integer perOrderLimit;
	String filterId;
	Integer minQty;
	Boolean autoAddCoupon;
	Boolean autoAddSku;
	Integer requirement;
	Integer subGroup;
	Integer buyGetIndex;
	Integer includeExcludeIndex;

	/**
	 * @return the couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}

	/**
	 * @param couponCode
	 *            the couponCode to set
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * @return the perOrderLimit
	 */
	public Integer getPerOrderLimit() {
		return perOrderLimit;
	}

	/**
	 * @param perOrderLimit
	 *            the perOrderLimit to set
	 */
	public void setPerOrderLimit(Integer perOrderLimit) {
		this.perOrderLimit = perOrderLimit;
	}



	/**
	 * @return the filterId
	 */
	public String getFilterId() {
		return filterId;
	}

	/**
	 * @param filterId the filterId to set
	 */
	public void setFilterId(String filterId) {
		this.filterId = filterId;
	}

	/**
	 * @return the minQty
	 */
	public Integer getMinQty() {
		return minQty;
	}

	/**
	 * @param minQty
	 *            the minQty to set
	 */
	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	/**
	 * @return the autoAddCoupon
	 */
	public Boolean getAutoAddCoupon() {
		return autoAddCoupon;
	}

	/**
	 * @param autoAddCoupon
	 *            the autoAddCoupon to set
	 */
	public void setAutoAddCoupon(Boolean autoAddCoupon) {
		this.autoAddCoupon = autoAddCoupon;
	}

	/**
	 * @return the autoAddSku
	 */
	public Boolean getAutoAddSku() {
		return autoAddSku;
	}

	/**
	 * @param autoAddSku
	 *            the autoAddSku to set
	 */
	public void setAutoAddSku(Boolean autoAddSku) {
		this.autoAddSku = autoAddSku;
	}

	/**
	 * @return the requirement
	 */
	public Integer getRequirement() {
		return requirement;
	}

	/**
	 * @param requirement
	 *            the requirement to set
	 */
	public void setRequirement(Integer requirement) {
		this.requirement = requirement;
	}

	/**
	 * @return the subGroup
	 */
	public Integer getSubGroup() {
		return subGroup;
	}

	/**
	 * @param subGroup
	 *            the subGroup to set
	 */
	public void setSubGroup(Integer subGroup) {
		this.subGroup = subGroup;
	}

	/**
	 * @return the buyGetIndex
	 */
	public Integer getBuyGetIndex() {
		return buyGetIndex;
	}

	/**
	 * @param buyGetIndex
	 *            the buyGetIndex to set
	 */
	public void setBuyGetIndex(Integer buyGetIndex) {
		this.buyGetIndex = buyGetIndex;
	}

	/**
	 * @return the includeExcludeIndex
	 */
	public Integer getIncludeExcludeIndex() {
		return includeExcludeIndex;
	}

	/**
	 * @param includeExcludeIndex
	 *            the includeExcludeIndex to set
	 */
	public void setIncludeExcludeIndex(Integer includeExcludeIndex) {
		this.includeExcludeIndex = includeExcludeIndex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coupon [couponCode=");
		builder.append(couponCode);
		builder.append(", perOrderLimit=");
		builder.append(perOrderLimit);
		builder.append(", filterId=");
		builder.append(filterId);
		builder.append(", minQty=");
		builder.append(minQty);
		builder.append(", autoAddCoupon=");
		builder.append(autoAddCoupon);
		builder.append(", autoAddSku=");
		builder.append(autoAddSku);
		builder.append(", requirement=");
		builder.append(requirement);
		builder.append(", subGroup=");
		builder.append(subGroup);
		builder.append(", buyGetIndex=");
		builder.append(buyGetIndex);
		builder.append(", includeExcludeIndex=");
		builder.append(includeExcludeIndex);
		builder.append("]");
		return builder.toString();
	}

}
