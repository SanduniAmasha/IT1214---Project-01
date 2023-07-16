class LibraryMember{
	private String memberID;
	private String name;

	public LibraryMember(String memberID, String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public String getMemberID(){
		return memberID;
	}
	
	public String getName(){
		return name;
	}
	
	public void displayMemberDetails(){
		System.out.println("Member ID : " + memberID);
		System.out.println("Name : " + name);
	}
}