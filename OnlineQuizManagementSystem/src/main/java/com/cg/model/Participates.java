package com.cg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paricipates_table")
public class Participates {
	@Id
	private int participatesId;
	private String participatesName;
	private int particpatesTeamId;
	public Participates(int participatesId, String participatesName, int particpatesTeamId) {
		super();
		this.participatesId = participatesId;
		this.participatesName = participatesName;
		this.particpatesTeamId = particpatesTeamId;
	}
	public int getParticipatesId() {
		return participatesId;
	}
	public void setParticipatesId(int participatesId) {
		this.participatesId = participatesId;
	}
	public String getParticipatesName() {
		return participatesName;
	}
	public void setParticipatesName(String participatesName) {
		this.participatesName = participatesName;
	}
	public int getParticpatesTeamId() {
		return particpatesTeamId;
	}
	public void setParticpatesTeamId(int particpatesTeamId) {
		this.particpatesTeamId = particpatesTeamId;
	}
	@Override
	public String toString() {
		return "Participates [participatesId=" + participatesId + ", participatesName=" + participatesName
				+ ", particpatesTeamId=" + particpatesTeamId + "]";
	}
	
	
}
