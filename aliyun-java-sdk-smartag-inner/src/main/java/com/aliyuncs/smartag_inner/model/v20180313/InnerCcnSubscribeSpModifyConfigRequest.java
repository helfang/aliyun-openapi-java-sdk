/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerCcnSubscribeSpModifyConfigRequest extends RpcAcsRequest<InnerCcnSubscribeSpModifyConfigResponse> {
	
	public InnerCcnSubscribeSpModifyConfigRequest() {
		super("Smartag-inner", "2018-03-13", "InnerCcnSubscribeSpModifyConfig", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String data;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("data", data);
		}
	}

	@Override
	public Class<InnerCcnSubscribeSpModifyConfigResponse> getResponseClass() {
		return InnerCcnSubscribeSpModifyConfigResponse.class;
	}

}
