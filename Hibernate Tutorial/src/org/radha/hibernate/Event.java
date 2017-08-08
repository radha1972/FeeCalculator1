package org.radha.hibernate;
import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table (name="Event")
public class Event {
public	int id;
public String name;
public  String location;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
	

}
