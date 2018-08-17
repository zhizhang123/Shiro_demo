package com.example.demo.entityDo;

import java.io.Serializable;
import java.util.Set;

import lombok.*;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Subject implements  Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer subId;
	private String subjectName;
	private Integer uId;
}
