package jfleck.gwt.helloserver.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import jfleck.gwt.helloserver.client.model.MyUser;

public interface MyUserServiceAsync {
        void getUserList(AsyncCallback<List<MyUser>> callback);
        void getUser(String id, AsyncCallback<MyUser> callback);
}