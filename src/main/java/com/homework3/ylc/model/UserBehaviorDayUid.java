package com.homework3.ylc.model;

public class UserBehaviorDayUid {
	private String Level;
	private String Degree;
	private String uid;
	private int behavior_total;
	private int behavior_publish;
	private int behavior_view;
	private int behavior_comment;
	private String day_time;
	
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getBehavior_total() {
		return behavior_total;
	}
	public void setBehavior_total(int behavior_total) {
		this.behavior_total = behavior_total;
	}
	public int getBehavior_publish() {
		return behavior_publish;
	}
	public void setBehavior_publish(int behavior_publish) {
		this.behavior_publish = behavior_publish;
	}
	public int getBehavior_view() {
		return behavior_view;
	}
	public void setBehavior_view(int behavior_view) {
		this.behavior_view = behavior_view;
	}
	public int getBehavior_comment() {
		return behavior_comment;
	}
	public void setBehavior_comment(int behavior_comment) {
		this.behavior_comment = behavior_comment;
	}
	public String getDay_time() {
		return day_time;
	}
	public void setDay_time(String day_time) {
		this.day_time = day_time;
	}
	
	
}
