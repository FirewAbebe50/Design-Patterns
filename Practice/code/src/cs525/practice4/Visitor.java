package cs525.practice4;

public interface Visitor {

	void visit(BookLoan book);

	void visit(MagazineLoan magazine);

	void visit(ResearchPaperLoan researchPaper);
}
