package exercises;

import java.util.Arrays;

/* 
 * 1. Make the JobCandidate class implement Comparable.  
 * 2. Add a JobCandadate instance that represents yourself, and use compareTo() to see who should be given the job.
 * 
 */

import java.util.List;

public class JobCandidate implements Comparable<JobCandidate> {

	private List<String> personalityTraits;
	private int hoursSpentCoding;
	private String teacherName;
	private int salaryRequired;

	public JobCandidate(List<String> personalityTraits, int hoursSpentCoding, String teacherName, int salaryRequired) {
		super();
		this.personalityTraits = personalityTraits;
		this.hoursSpentCoding = hoursSpentCoding;
		this.teacherName = teacherName;
		this.salaryRequired = salaryRequired;
	}

	public static void main(String[] args) {
		JobCandidate june = new JobCandidate(Arrays.asList(new String[] { "adaptable", "scatty", "curious" }), 650,
				"Vinny Wade", 1200000);
		JobCandidate ivana = new JobCandidate(Arrays.asList(new String[] { "flexible", "responsible" }), 200,
				"June Clarke", 1000000);

		if (june.compareTo(ivana) == 1) {
			System.out.println("June is better candidate for this job.");
		} else if (june.compareTo(ivana) == -1) {
			System.out.println("Ivana is better candidate for this job.");
		} else {
			System.out.println("Both candidates are equally good");
		}

	}

	@Override
	public int compareTo(JobCandidate o) {

		if (this.personalityTraits.size() > o.personalityTraits.size()) {

			if (this.hoursSpentCoding > o.hoursSpentCoding) {
				return 1;
			} else if (this.hoursSpentCoding < o.hoursSpentCoding) {
				if (this.salaryRequired < o.salaryRequired) {
					return 1;
				} else if (this.salaryRequired > o.salaryRequired) {
					return -1;
				} else {
					return 0;
				}
			} else {
				if (this.salaryRequired < o.salaryRequired) {
					return 1;
				} else if (this.salaryRequired > o.salaryRequired) {
					return 0;
				} else {
					return 1;
				}
			}

		} else if (this.personalityTraits.size() < o.personalityTraits.size()) {

			if (this.hoursSpentCoding > o.hoursSpentCoding) {
				if (this.salaryRequired < o.salaryRequired) {
					return 1;
				} else if (this.salaryRequired > o.salaryRequired) {
					return -1;
				} else {
					return 0;
				}
			} else if (this.hoursSpentCoding < o.hoursSpentCoding) {
				return -1;
			} else {
				if (this.salaryRequired < o.salaryRequired) {
					return 0;
				} else if (this.salaryRequired > o.salaryRequired) {
					return -1;
				} else {
					return -1;
				}
			}

		} else {

			if (this.hoursSpentCoding > o.hoursSpentCoding) {
				if (this.salaryRequired < o.salaryRequired) {
					return 1;
				} else if (this.salaryRequired > o.salaryRequired) {
					return 0;
				} else {
					return 1;
				}
			} else if (this.hoursSpentCoding < o.hoursSpentCoding) {
				if (this.salaryRequired < o.salaryRequired) {
					return 0;
				} else if (this.salaryRequired > o.salaryRequired) {
					return -1;
				} else {
					return -1;
				}
			} else {
				if (this.salaryRequired < o.salaryRequired) {
					return 1;
				} else if (this.salaryRequired > o.salaryRequired) {
					return -1;
				} else {
					return 0;
				}
			}

		}

	}

}
