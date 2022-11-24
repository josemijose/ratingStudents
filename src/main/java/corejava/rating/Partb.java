package corejava.rating;


public class Partb {

	String studentName;
	String subject;
	
	public Partb(String studentName, String subject) {

		this.studentName = studentName;
		this.subject = subject;
	}
	@Override
	public int hashCode() {
		final int p = 31;
		int result = 1;
		result = p * result + ((studentName == null) ? 0 : studentName.hashCode());
		result = p * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partb other = (Partb) obj;
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
