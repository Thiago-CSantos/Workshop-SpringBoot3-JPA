package com.lyzard.cursoSpringBoot.service.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not Found - Recurso não encontrado. Id" + id);
	}
	
}
