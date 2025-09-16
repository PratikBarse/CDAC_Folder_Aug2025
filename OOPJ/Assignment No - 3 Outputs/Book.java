class Book{
	private int copiesAvailable;
	void addCopies(int n){
		copiesAvailable = copiesAvailable + n;
	}
	void removeCopies(int n){
		if(n <= copiesAvailable){
			copiesAvailable = copiesAvailable - n;
		} else {
			System.out.println("Not enough copies to remove");
		}
	}
	
	int getCopiesAvailable(){
		return copiesAvailable; 
	}
	public static void main(String args[]){
		Book b = new Book();
		b.addCopies(3);
		b.removeCopies(1);
		System.out.println("Copies available = " + b.getCopiesAvailable());
	}
}