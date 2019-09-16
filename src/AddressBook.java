import java.util.List;
public class AddressBook {
	private List<BuddyInfo> buddies;
	
	public void addBuddy(BuddyInfo buddy) {
		if (buddy != null) buddies.add(buddy);
	}
	
	public void removeBuddy(int index) {
		if (index >=0 && index < buddies.size()) buddies.remove(index);
		
	}
	
	public void main(String[] args) {
		System.out.println("#AlwaysBeBurying");
		BuddyInfo fren = new BuddyInfo();
		AddressBook book = new AddressBook();
		book.addBuddy(fren);
		book.removeBuddy(0);
	}
}
