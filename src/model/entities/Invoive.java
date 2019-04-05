package model.entities;

public class Invoive {

	private Double basicPayment;
	private Double tax;

	public Invoive() {

	}

	public Invoive(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotlPayment() {
		return getBasicPayment() + getTax();
	}

}
