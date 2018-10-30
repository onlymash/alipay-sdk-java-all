package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.stall.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-26 01:21:33
 */
public class KoubeiCateringPosStallCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2569647353158893999L;

	/** 
	 * 档口id
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}