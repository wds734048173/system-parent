package org.lanqiao;

import java.util.Date;

public class Customerinfo {
    private int CustomerId;  //客户编号
    private String CustomerName;//客户名称
    private String CustomerPwd;//客户密码
    private String Customertruename;//真实姓名
    private int CustomerSex;//性别
    private String CustomerTel;//客户电话
    private String CustomerEmail;//E-mail
    private String CustomerAddr;//地址
    private Date Ctime;//注册时间
    private Date Rtime;//修改时间
    private String CustomerQues;//提示问题
    private String CustomerAnswer;//问题答案
    private int CustomerLogTime;//登录次数
    private Date CustomerLastLogT;//最近登录时间

    //构造函数
    public Customerinfo() {
    }

    public Customerinfo(int customerId, String customerName, String customerPwd, String customertruename, int customerSex, String customerTel, String customerEmail, String customerAddr, Date ctime, Date rtime, int customerLogTime, Date customerLastLogT) {
        CustomerId = customerId;
        CustomerName = customerName;
        CustomerPwd = customerPwd;
        Customertruename = customertruename;
        CustomerSex = customerSex;
        CustomerTel = customerTel;
        CustomerEmail = customerEmail;
        CustomerAddr = customerAddr;
        Ctime = ctime;
        Rtime = rtime;
        CustomerLogTime = customerLogTime;
        CustomerLastLogT = customerLastLogT;
    }

    public Customerinfo(int customerId, String customerName, String customerPwd, String customertruename, int customerSex, String customerTel, String customerEmail, String customerAddr, Date ctime, Date rtime, String customerQues, String customerAnswer, int customerLogTime, Date customerLastLogT) {
        CustomerId = customerId;
        CustomerName = customerName;
        CustomerPwd = customerPwd;
        Customertruename = customertruename;
        CustomerSex = customerSex;
        CustomerTel = customerTel;
        CustomerEmail = customerEmail;
        CustomerAddr = customerAddr;
        Ctime = ctime;
        Rtime = rtime;
        CustomerQues = customerQues;
        CustomerAnswer = customerAnswer;
        CustomerLogTime = customerLogTime;
        CustomerLastLogT = customerLastLogT;
    }
    //get和set
    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerPwd() {
        return CustomerPwd;
    }

    public void setCustomerPwd(String customerPwd) {
        CustomerPwd = customerPwd;
    }

    public String getCustomertruename() {
        return Customertruename;
    }

    public void setCustomertruename(String customertruename) {
        Customertruename = customertruename;
    }

    public int getCustomerSex() {
        return CustomerSex;
    }

    public void setCustomerSex(int customerSex) {
        CustomerSex = customerSex;
    }

    public String getCustomerTel() {
        return CustomerTel;
    }

    public void setCustomerTel(String customerTel) {
        CustomerTel = customerTel;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerAddr() {
        return CustomerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        CustomerAddr = customerAddr;
    }

    public Date getCtime() {
        return Ctime;
    }

    public void setCtime(Date ctime) {
        Ctime = ctime;
    }

    public Date getRtime() {
        return Rtime;
    }

    public void setRtime(Date rtime) {
        Rtime = rtime;
    }

    public String getCustomerQues() {
        return CustomerQues;
    }

    public void setCustomerQues(String customerQues) {
        CustomerQues = customerQues;
    }

    public String getCustomerAnswer() {
        return CustomerAnswer;
    }

    public void setCustomerAnswer(String customerAnswer) {
        CustomerAnswer = customerAnswer;
    }

    public int getCustomerLogTime() {
        return CustomerLogTime;
    }

    public void setCustomerLogTime(int customerLogTime) {
        CustomerLogTime = customerLogTime;
    }

    public Date getCustomerLastLogT() {
        return CustomerLastLogT;
    }

    public void setCustomerLastLogT(Date customerLastLogT) {
        CustomerLastLogT = customerLastLogT;
    }
    //重写toString()
    @Override
    public String toString() {
        return "Customerinfo{" +
                "CustomerId=" + CustomerId +
                ", CustomerName='" + CustomerName + '\'' +
                ", CustomerPwd='" + CustomerPwd + '\'' +
                ", Customertruename='" + Customertruename + '\'' +
                ", CustomerSex=" + CustomerSex +
                ", CustomerTel='" + CustomerTel + '\'' +
                ", CustomerEmail='" + CustomerEmail + '\'' +
                ", CustomerAddr='" + CustomerAddr + '\'' +
                ", Ctime=" + Ctime +
                ", Rtime=" + Rtime +
                ", CustomerQues='" + CustomerQues + '\'' +
                ", CustomerAnswer='" + CustomerAnswer + '\'' +
                ", CustomerLogTime=" + CustomerLogTime +
                ", CustomerLastLogT=" + CustomerLastLogT +
                '}';
    }
}
