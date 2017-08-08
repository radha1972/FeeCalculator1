package com.tutorialspoint.struts2;


	public class UserBean {  
		 private String userName;  
		 private int userAge;  
		   
		 public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getUserAge() {
			return userAge;
		}
		public void setUserAge(int userAge) {
			this.userAge = userAge;
		}
		public String getUserJob() {
			return userJob;
		}
		public void setUserJob(String userJob) {
			this.userJob = userJob;
		}
		public String[] getUserHobbies() {
			return userHobbies;
		}
		public void setUserHobbies(String[] userHobbies) {
			this.userHobbies = userHobbies;
		}
		private String userJob;  
		 private String []userHobbies;  

}
