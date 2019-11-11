package com.coverletter.main.parameter;

import java.lang.reflect.Field;

public class ParamObject {
	public boolean nullCheck() {
		boolean verification = true;
		try {
			Field[] fileds = this.getClass().getDeclaredFields();
			
			for(Field field : fileds) {
				field.setAccessible(true);
				Object fieldvalue = field.get(this);
				
				System.out.println(field.toString() + ":" + fieldvalue);
				if(fieldvalue == null || fieldvalue.toString().equals("")) {
					verification = false;
					break;
				}
			}
		} catch (IllegalAccessException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			verification = false;
		}
		
		return verification;
	}
}
