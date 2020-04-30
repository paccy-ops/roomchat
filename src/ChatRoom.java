import java.util.*;

public class ChatRoom {
    private int IdChatRoom;
    private String description;
    private Map<String, Integer>chats;

    public ChatRoom(int idChatRoom, String description) {
        IdChatRoom = idChatRoom;
        this.description = description;
        this.chats = new HashMap<>();
        this.chats.put("6",6);
        this.chats.put("1",1);
        this.chats.put("2",2);
        this.chats.put("3",3);
        this.chats.put("4",6);
    }

    public int getIdChatRoom() {
        return IdChatRoom;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getChats() {
        return chats;
    }

    public void ChangeLocation(String direction, int location){
        chats.put(direction,location);
    }

}
