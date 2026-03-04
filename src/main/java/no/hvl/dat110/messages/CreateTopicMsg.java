package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
    private String topic;
    private String user;
    public CreateTopicMsg(String user, String topic) {
        this.topic = topic;
        this.user = user;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String toString(){
       String str = "topic: "+topic+"\nuser: "+user;
       return str;
    }




	// TODO: 
	// Implement object variables - a topic is required



	// Complete the constructor, get/set-methods, and toString method
    // as described in the project text	
}
