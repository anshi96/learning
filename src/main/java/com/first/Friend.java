package com.first;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


public class Friend {
	
	List<String> friends = new ArrayList<>();
	
	public int getFriendCount() {
		
		return friends.size();
		
	}	
	
	
  public List<String> getAllFriends() {
		
	  friends.add("anshi");
	  friends.add("aman");
	  friends.add("priya");
	  friends.add("ritu");
	  friends.add("preeti");
	  
	  return friends;
		
	}
  
  
  
  public List<String> addFriend(String name) {
	  
	    friends.add(name);
	    return friends;
	  
	  
  }	
	

}
