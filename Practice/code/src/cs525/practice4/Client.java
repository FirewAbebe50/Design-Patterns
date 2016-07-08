package cs525.practice4;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		LibraryMember member = new LibraryMember();
		member.setMemberType(MemberType.STUDENT);

		List<LoanItem> items = new ArrayList<>();
		member.setLoanItems(items);

		System.out.println("TotalFine: " + member.getTotalFine());

	}
}
