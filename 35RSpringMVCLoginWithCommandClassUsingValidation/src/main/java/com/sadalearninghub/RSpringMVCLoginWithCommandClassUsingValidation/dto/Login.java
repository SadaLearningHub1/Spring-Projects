package com.sadalearninghub.RSpringMVCLoginWithCommandClassUsingValidation.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Login {
	@NotEmpty
	@Size(min=5, max=10)
	private String uname;
	
	@NotEmpty
	@Size(min=5)
	private String pwd;
}
