
import java.util.*;

public class Main {

    private static Map<Integer, ChatRoom> chatRoomMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        chatRoomMap.put(0, new ChatRoom(0, "Welcome!, How can help you? \n ENROLLMENT?,SCHOOL FEES......"));
        chatRoomMap.put(1, new ChatRoom(1, "In which course?, we have COMPUTER Engineering, ELECTRONICS Engineering, and CIVIL Engineering"));

        chatRoomMap.put(2, new ChatRoom(2, "You can leave your email, we will back back to you in an hour via email."));
        chatRoomMap.put(3, new ChatRoom(3, " do you have another question?"));

        chatRoomMap.put(4, new ChatRoom(4, "28/05/2020"));
        chatRoomMap.put(5, new ChatRoom(5, "it's okay?"));

        chatRoomMap.put(6, new ChatRoom(6, "Thanks for being with us! we will contact you via email"));

        chatRoomMap.get(1).ChangeLocation("1", 1);

        chatRoomMap.get(2).ChangeLocation("2",2);
        chatRoomMap.get(3).ChangeLocation("2",3);
        chatRoomMap.get(4).ChangeLocation("2",4);
        chatRoomMap.get(5).ChangeLocation("2",5);
        chatRoomMap.get(6).ChangeLocation("2",6);



        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("ENROLLMENT","1");
        vocabulary.put("COMPUTER","2");
        vocabulary.put("EMAIL","3");
        vocabulary.put("NO","6");


        int loc = 0;
        while (true){
            System.out.println(chatRoomMap.get(loc).getDescription());
            if (loc ==6){
                break;
            }
            Map<String, Integer>chats = chatRoomMap.get(loc).getChats();

            System.out.println();

            String direction = user.nextLine().toUpperCase();
            if (direction.length()>1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
            if (chats.containsKey(direction)){
                loc = chats.get(direction);
            }else{
                System.out.println("service is not available");
            }
        }

    }
}





