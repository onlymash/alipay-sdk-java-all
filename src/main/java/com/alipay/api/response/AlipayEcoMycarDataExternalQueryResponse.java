package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.data.external.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEcoMycarDataExternalQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1866553358377724171L;

	/** 
	 * 30
	 */
	@ApiField("external_system_name")
	private String externalSystemName;

	/** 
	 * outter_response
	 */
	@ApiField("query_result")
	private String queryResult;

	public void setExternalSystemName(String externalSystemName) {
		this.externalSystemName = externalSystemName;
	}
	public String getExternalSystemName( ) {
		return this.externalSystemName;
	}

	public void setQueryResult(String queryResult) {
		this.queryResult = queryResult;
	}
	public String getQueryResult( ) {
		return this.queryResult;
	}

}
