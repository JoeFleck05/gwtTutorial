package de.jfleck.gwt.helloserver.client.service;

import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import de.jfleck.gwt.helloserver.client.model.MyUser;
import de.jfleck.gwt.helloserver.client.table.DataSource;
import de.jfleck.gwt.helloserver.client.table.MyTable;

public class MyUserCallback implements AsyncCallback<List<MyUser>> {

    private MyTable table;

    public MyUserCallback(MyTable table) {
        this.table = table;
    }

    public void onFailure(Throwable caught) {
        Window.alert(caught.getMessage());
    }

    public void onSuccess(List<MyUser> result) {
        List<MyUser> users = result;
        DataSource datasource = new DataSource(users);
        table.setInput(datasource);
        for (MyUser user : users) {
            System.out.println(user.getUsername());
        }
    }

}