package com.clockifyapipoc.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@Data
public class TimeInterval{

	@JsonProperty("duration")
	private String duration;

	@JsonProperty("start")
	private String start;

	@JsonProperty("end")
	private String end;

	@Override
 	public String toString(){
		return 
			"TimeInterval{" + 
			"duration = '" + duration + '\'' + 
			",start = '" + start + '\'' + 
			",end = '" + end + '\'' + 
			"}";
		}
}