package corejava.rating;


public class Parta {
	
	String studentName;
	String subject;
	String assignmentCategory;

	public Parta(String studentName, String subject, String assignmentCategory) {

		this.studentName = studentName;
		this.subject = subject;
		this.assignmentCategory = assignmentCategory;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int p = 31;
		int result = 1;
		result = p * result + ((assignmentCategory == null) ? 0 : assignmentCategory.hashCode());
		result = p * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = p * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
		
//		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parta other = (Parta) obj;
		if (assignmentCategory == null) {
			if (other.assignmentCategory != null)
				return false;
		} else if (!assignmentCategory.equals(other.assignmentCategory))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
	
	
	
	
}
