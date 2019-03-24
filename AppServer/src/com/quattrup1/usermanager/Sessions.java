package com.quattrup1.usermanager;

import com.quattrup1.db.DB;
import com.quattrup1.db.User;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Sessions {
	private static Sessions sessions;
	private Sessions() {}
	public static Sessions getInstance() {
		if(sessions == null)
			sessions = new Sessions();
		return sessions;
	}
	
	private Set<User> sessionIds;
	private Set<User> loggedUsers;
	public boolean isLoggedIn(long sessionId) {
		return sessionIds.contains(sessionId);
	}
	public long login(User user) {
		long sessionId = loggedUsers.stream().filter(user::equals).map(User::getSessionId).findAny().orElse(-1L);
		if(sessionId == -1)
			if(Arrays.asList(DB.users).contains(user)) {
				sessionId = Math.abs(new Random().nextLong());
			}
		return sessionId;
	}
	
}
