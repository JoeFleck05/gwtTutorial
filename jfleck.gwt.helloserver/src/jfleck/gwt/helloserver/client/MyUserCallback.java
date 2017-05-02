package jfleck.gwt.helloserver.client;
import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

import jfleck.gwt.helloserver.client.DataSource;
import jfleck.gwt.helloserver.client.MyTable;
import jfleck.gwt.helloserver.client.model.MyUser;

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
