package com.test.vuespringtest.entity;

/**
 * @Description  
 * @Author  zhangshengfei
 * @Date 2020-08-02 13:31:54 
 */

public class Manager {

  private long managerId;
  private String managerName;
  private String managerPwd;
  private String managerPhone;

 public Manager() {
 }

 public Manager( long managerId, String managerName, String managerPwd, String managerPhone ) {
  this.managerId = managerId;
  this.managerName = managerName;
  this.managerPwd = managerPwd;
  this.managerPhone = managerPhone;
 }

  public long getManagerId() {
    return managerId;
  }

  public void setManagerId(long managerId) {
    this.managerId = managerId;
  }


  public String getManagerName() {
    return managerName;
  }

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }


  public String getManagerPwd() {
    return managerPwd;
  }

  public void setManagerPwd(String managerPwd) {
    this.managerPwd = managerPwd;
  }


  public String getManagerPhone() {
    return managerPhone;
  }

  public void setManagerPhone(String managerPhone) {
    this.managerPhone = managerPhone;
  }


	@Override
	public String toString() {
		return "{" +
					"managerId='" + managerId + '\'' +
					"managerName='" + managerName + '\'' +
					"managerPwd='" + managerPwd + '\'' +
					"managerPhone='" + managerPhone + '\'' +
				'}';
	}

}
