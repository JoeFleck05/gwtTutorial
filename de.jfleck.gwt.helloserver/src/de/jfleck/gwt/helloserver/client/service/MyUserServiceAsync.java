package de.jfleck.gwt.helloserver.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import de.jfleck.gwt.helloserver.client.model.MyUser;;

public interface MyUserServiceAsync {
	void getUserList(AsyncCallback<List<MyUser>> callback);
	void getUser(String id, AsyncCallback<MyUser> callback);
}
