package com.GreatlLearning.Assessment;

public class SuperDepartment {
	

		public void departmentname() {
			System.out.println("Super Department");
		}

		public void getTodaysWork() {
			System.out.println("getTodaysWork ");
		}

		public void getWorkDeadline() {
			System.out.println(" Nil");
		}

		public void isTodayAHoliday() {
			System.out.println("Today is not a holiday ");
		}
	}

	class AdminDepartment extends SuperDepartment {

		public void departmentname() {
			System.out.println(" Welcome to Admin Department");
		}

		public void getTodaysWork() {
			System.out.println("Complete your documents Submission ");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD ");
		}
	}

	class HrDepartment extends SuperDepartment {

		public void departmentname() {
			System.out.println(" Welcome to Hr Department");
		}

		public void getTodaysWork() {
			System.out.println("Fill today’s worksheet and mark your attendance ");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD ");
		}

		public void doActivity() {
			System.out.println("team Lunch ");
		}
	}

	class TechDepartment extends SuperDepartment {

		public void departmentname() {
			System.out.println("Welcome to Tech Department ");
		}

		public void getTodaysWork() {
			System.out.println("Complete coding of module 1 ");
		}

		public void getWorkDeadline() {
			System.out.println("Complete by EOD ");
		}

		public void getTechStackInformation() {
			System.out.println("core Java ");
		}
	}

