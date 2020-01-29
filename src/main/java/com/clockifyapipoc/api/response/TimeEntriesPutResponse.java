package com.clockifyapipoc.api.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@Data
public class TimeEntriesPutResponse {

	@JsonProperty("isLocked")
	private String isLocked;

	@JsonProperty("tagIds")
	private List<String> tagIds;

	@JsonProperty("description")
	private String description;

	@JsonProperty("timeInterval")
	private TimeInterval timeInterval;

	@JsonProperty("id")
	private String id;

	@JsonProperty("billable")
	private String billable;

	@JsonProperty("projectId")
	private String projectId;

	@JsonProperty("userId")
	private String userId;

	@JsonProperty("taskId")
	private String taskId;

	@JsonProperty("workspaceId")
	private String workspaceId;

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"isLocked = '" + isLocked + '\'' + 
			",tagIds = '" + tagIds + '\'' + 
			",description = '" + description + '\'' + 
			",timeInterval = '" + timeInterval + '\'' + 
			",id = '" + id + '\'' + 
			",billable = '" + billable + '\'' + 
			",projectId = '" + projectId + '\'' + 
			",userId = '" + userId + '\'' + 
			",taskId = '" + taskId + '\'' + 
			",workspaceId = '" + workspaceId + '\'' + 
			"}";
		}
}