package Esercizio_1;

public abstract class Document {
	
	protected String title;

	public Document(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract String print();
	
	public abstract void save();
	
	public abstract void load();
}
