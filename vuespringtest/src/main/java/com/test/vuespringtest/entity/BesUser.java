package com.test.vuespringtest.entity;

/**
 * @Description  
 * @Author  zhangshengfei
 * @Date 2020-08-02 00:15:50 
 */

public class BesUser {

  private long userId;
  private String userName;
  private long userAge;
  private String userPhone;

 public BesUser() {
 }

 public BesUser( long userId, String userName, long userAge, String userPhone ) {
  this.userId = userId;
  this.userName = userName;
  this.userAge = userAge;
  this.userPhone = userPhone;
 }

  public long getuserId() {
    return userId;
  }

  public void setuserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getUserAge() {
    return userAge;
  }

  public void setUserAge(long userAge) {
    this.userAge = userAge;
  }


  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

	@Override
	public String toString() {
		return "{" +
					"userId='" + userId + '\'' +
					"userName='" + userName + '\'' +
					"userAge='" + userAge + '\'' +
					"userPhone='" + userPhone + '\'' +
				'}';
	}

}
