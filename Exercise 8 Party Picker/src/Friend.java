public class Friend extends Person {
    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodToBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodToBring;
    }

    @Override
    public String toString() {
        String inviteText;

        if (getIsInvited()) {
            inviteText = "They are invited to the party.";
        } else {
            inviteText = "They are NOT invited to the party.";
        }

        return getFullName() + " is bringing " + foodToBring + ". " + inviteText;
    }
}
