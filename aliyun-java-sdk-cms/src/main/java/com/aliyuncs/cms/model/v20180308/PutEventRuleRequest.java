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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PutEventRuleRequest extends RpcAcsRequest<PutEventRuleResponse> {
	
	public PutEventRuleRequest() {
		super("Cms", "2018-03-08", "PutEventRule", "cms");
	}

	private List<EventPattern> eventPatterns;

	private String groupId;

	private String name;

	private String description;

	private String eventType;

	private String state;

	public List<EventPattern> getEventPatterns() {
		return this.eventPatterns;
	}

	public void setEventPatterns(List<EventPattern> eventPatterns) {
		this.eventPatterns = eventPatterns;	
		if (eventPatterns != null) {
			for (int depth1 = 0; depth1 < eventPatterns.size(); depth1++) {
				putQueryParameter("EventPattern." + (depth1 + 1) + ".Product" , eventPatterns.get(depth1).getProduct());
				if (eventPatterns.get(depth1).getNameLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getNameLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".NameList." + (i + 1) , eventPatterns.get(depth1).getNameLists().get(i));
					}
				}
				if (eventPatterns.get(depth1).getStatusLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getStatusLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".StatusList." + (i + 1) , eventPatterns.get(depth1).getStatusLists().get(i));
					}
				}
				if (eventPatterns.get(depth1).getLevelLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getLevelLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".LevelList." + (i + 1) , eventPatterns.get(depth1).getLevelLists().get(i));
					}
				}
			}
		}	
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public static class EventPattern {

		private String product;

		private List<String> nameLists;

		private List<String> statusLists;

		private List<String> levelLists;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<String> getNameLists() {
			return this.nameLists;
		}

		public void setNameLists(List<String> nameLists) {
			this.nameLists = nameLists;
		}

		public List<String> getStatusLists() {
			return this.statusLists;
		}

		public void setStatusLists(List<String> statusLists) {
			this.statusLists = statusLists;
		}

		public List<String> getLevelLists() {
			return this.levelLists;
		}

		public void setLevelLists(List<String> levelLists) {
			this.levelLists = levelLists;
		}
	}

	@Override
	public Class<PutEventRuleResponse> getResponseClass() {
		return PutEventRuleResponse.class;
	}

}
