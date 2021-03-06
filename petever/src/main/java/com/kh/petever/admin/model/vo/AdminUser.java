package com.kh.petever.admin.model.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminUser implements Serializable {

	
	private String userId;
	private String userPwd;
	private String userEmail;
	private String userBirth;
	private String userPhone;
	private String userLocal;
	private char userRole;
	private int cnt;
	

}