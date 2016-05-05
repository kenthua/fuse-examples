package org.jboss.jbossas.quickstarts.wshelloworld.helloworld;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="MyDummyPOJO", namespace="http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld")
public class MyDummyPOJO implements Serializable{
    private final static long serialVersionUID = 1L;

	private String id;
private String name;
private String message;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
