import java.util.List;
public class AddressBook {
	private List<BuddyInfo> buddies;
	
	public void addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy) {
		buddies.remove(buddy);
	}
	
	public void main(String[] args) {
		System.out.println("#AlwaysBeBurying");
	}
}
