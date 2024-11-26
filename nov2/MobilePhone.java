package nov2;

public abstract class MobilePhone extends Phone {
    @Override
    public void makeCalls() {
        System.out.println("You can make calls using Mobile Phone ");
    }

    @Override
    public void receiveCalls() {
        System.out.println("You can receive calls using Mobile Phone ");
    }

    @Override
    public void leaveVoiceMails() {
        System.out.println("You can leave voice mails  using Mobile Phone ");
    }

    public abstract void sendTextMessages();

    public abstract void playGames();

    public abstract void storeContacts();

}
