package cs525.practice4;

import java.util.List;

public class LibraryMember {

	private String memeberId;
	private MemberType memberType;
	private List<LoanItem> loanItems;

	
	public String getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public List<LoanItem> getLoanItems() {
		return loanItems;
	}

	public void setLoanItems(List<LoanItem> loanItems) {
		this.loanItems = loanItems;
	}

	public double getTotalFine() {

		FineCalculatorVisitor visitor = new FineCalculatorVisitor(memberType);

		for (LoanItem item : loanItems) {
			item.accept(visitor);

		}

		double fine = visitor.getTotalFine();

		return fine;
	}

}
