package jfleck.gwt.helloserver.client;

import java.util.ArrayList;
import java.util.List;

import jfleck.gwt.helloserver.client.model.MyUser;

public class DataSource {
	
	private final List<MyUser> users;
    private List<String> header;

    public DataSource(List<MyUser> users) {
        header = new ArrayList<String>();
        header.add("Id");
        header.add("Name");
        header.add("Number of Hits");
        this.users = users;
    }

    public List<MyUser> getUsers() {
        return users;
    }

    public List<String> getTableHeader() {
        return header;
    }

}
