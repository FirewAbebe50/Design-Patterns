package cs525.practice4;

import java.util.Date;

public class MagazineLoan implements LoanItem {

	private String title;
	private String publication;
	private Date borrowDate;

	private Date returnDate;
	private double finePerDay;
	private int maxLoanPeriodInDays;

	public int getMaxLoanPeriodInDays() {
		return maxLoanPeriodInDays;
	}

	public void setMaxLoanPeriodInDays(int maxLoanPeriodInDays) {
		this.maxLoanPeriodInDays = maxLoanPeriodInDays;
	}

	public double getFinePerDay() {
		return finePerDay;
	}

	public void setFinePerDay(double finePerDay) {
		this.finePerDay = finePerDay;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	private Date pubDate;

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}
}
