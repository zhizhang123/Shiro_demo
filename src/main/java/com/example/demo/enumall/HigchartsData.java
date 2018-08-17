package com.example.demo.enumall;

import lombok.*;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HigchartsData {
	private Integer id;
	private String name;
	private Object[] data;
}
