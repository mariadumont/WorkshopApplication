
public class InvoiceLine {
	public int numInvoiceLine;
	public int numArticles;
	public int codArt;
	public int codQuantity;

	public InvoiceLine() {
	}

	public int getNumInvoiceLine() {
		return numInvoiceLine;
	}

	public void setNumInvoiceLine(int numInvoiceLine) {
		this.numInvoiceLine = numInvoiceLine;
	}

	public int getNumArticles() {
		return numArticles;
	}

	public void setNumArticles(int numArticles) {
		this.numArticles = numArticles;
	}

	public int getCodArt() {
		return codArt;
	}

	public void setCodArt(int codArt) {
		this.codArt = codArt;
	}

	public int getCodQuantity() {
		return codQuantity;
	}

	public void setCodQuantity(int codQuantity) {
		this.codQuantity = codQuantity;
	}
	public double calculateImport(Product p, int quantity) {
		int price = p.getProdPrice();
		return price*quantity;
	}
}