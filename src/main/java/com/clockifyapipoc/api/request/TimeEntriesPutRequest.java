package com.clockifyapipoc.api.request;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@Data
public class TimeEntriesPutRequest {

	@JsonProperty("start")
	private String start;

	@JsonProperty("billable")
	private String billable;

	@JsonProperty("description")
	private String description;

	@JsonProperty("projectId")
	private String projectId;

	@JsonProperty("taskId")
	private String taskId;

	@JsonProperty("end")
	private String end;

	@JsonProperty("tagIds")
	private List<String> tagIds;

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"tagIds = '" + tagIds + '\'' + 
			",start = '" + start + '\'' + 
			",description = '" + description + '\'' + 
			",end = '" + end + '\'' + 
			",billable = '" + billable + '\'' + 
			",projectId = '" + projectId + '\'' + 
			",taskId = '" + taskId + '\'' + 
			"}";
		}
}