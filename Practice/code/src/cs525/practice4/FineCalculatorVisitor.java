package cs525.practice4;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FineCalculatorVisitor implements Visitor {

	private double totalFine = 0.0;
	private double maxFine;

	public FineCalculatorVisitor(MemberType memberType) {
		
		if(memberType.equals(MemberType.STUDENT))
			maxFine = 10;
		else 
			maxFine = 5;
	}

	@Override
	public void visit(BookLoan book) {
		double fine = 0;
		long diff = new Date().getTime() - book.getBorrowDate().getTime();
		long loanDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		if (loanDays > book.getMaxLoanPeriodInDays()) {
			long overDueDays = loanDays - book.getMaxLoanPeriodInDays();
			fine = overDueDays * book.getFinePerDay();
			if (fine > maxFine)
				fine = maxFine;
		}

		totalFine += fine;

	}

	@Override
	public void visit(MagazineLoan magazine) {
		double fine = 0;
		long diff = new Date().getTime() - magazine.getBorrowDate().getTime();
		long loanDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		if (loanDays > magazine.getMaxLoanPeriodInDays()) {
			long overDueDays = loanDays - magazine.getMaxLoanPeriodInDays();
			fine = overDueDays * magazine.getFinePerDay();
			if (fine > maxFine)
				fine = maxFine;
		}

		totalFine += fine;

	}

	@Override
	public void visit(ResearchPaperLoan researchPaper) {
		double fine = 0;
		long diff = new Date().getTime() - researchPaper.getBorrowDate().getTime();
		long loanDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		if (loanDays > researchPaper.getMaxLoanPeriodInDays()) {
			long overDueDays = loanDays - researchPaper.getMaxLoanPeriodInDays();
			fine = overDueDays * researchPaper.getFinePerDay();
			if (fine > maxFine)
				fine = maxFine;
		}

		totalFine += fine;

	}

	public double getTotalFine() {
		return totalFine;
	}

}
