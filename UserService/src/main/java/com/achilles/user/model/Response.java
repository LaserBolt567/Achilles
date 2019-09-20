package com.achilles.user.model;

public class Response<T> {
	private String status;
	private T response;

	public Response() {
		super();
	}

	public Response(String status, T response) {
		super();
		this.status = status;
		this.response = response;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", response=" + response + "]";
	}
}
