package com.achilles.user.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Entity<T> {
	private String id;
	private String type;
	@JsonInclude(Include.NON_NULL)
	private T entity;

	public Entity() {
		super();
	}

	public Entity(String id, String type, T entity) {
		super();
		this.id = id;
		this.type = type;
		this.entity = entity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", type=" + type + ", entity=" + entity + "]";
	}
}
