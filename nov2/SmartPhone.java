package nov2;

public class SmartPhone extends MobilePhone {
    @Override
    public void sendTextMessages() {
        System.out.println("You can send text messages by touching screen ");
    }

    @Override
    public void playGames() {
        System.out.println("Playing Candy Crush...");
    }

    @Override
    public void storeContacts() {

    }


    @Override
    public void receiveCalls() {
        super.receiveCalls();
    }

    @Override
    public void leaveVoiceMails() {
        super.leaveVoiceMails();
    }
}
