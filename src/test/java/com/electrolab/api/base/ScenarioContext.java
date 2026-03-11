package com.electrolab.api.base;

import java.util.HashMap;
import java.util.Map;


//DATA STORAGE

public class ScenarioContext {
	
	private Map<String,Object> data = new HashMap<>();  //Creates a key-value storage.
	
	public void set(String Key, Object Value) {  // Stores data into context.
		data.put(Key,Value);
	}
	
	public Object get(String Key) {   //Retrieves stored value.
		return data.get(Key);
	}
}


/*
Temporary memory for a single test

Step 1 → create user → get userId
Step 2 → update user using userId
Step 3 → delete user using same userId

*/
