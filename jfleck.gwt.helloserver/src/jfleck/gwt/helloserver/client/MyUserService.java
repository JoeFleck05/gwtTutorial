package jfleck.gwt.helloserver.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import jfleck.gwt.helloserver.client.model.MyUser;

//
@RemoteServiceRelativePath("userService")
public interface MyUserService extends RemoteService {
        List<MyUser> getUserList();
        MyUser getUser(String id);
}
