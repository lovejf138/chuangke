package com.webpos.entity;import com.webpos.tools.CommUtil;import java.io.Serializable;import java.util.Date;public class Account  implements Serializable{  private static final long serialVersionUID = 1L;  private Long id;  private String user_id;  private String amount;  private String type;  private Date ctime;  private String status;  private Double all_eth;  private String play_sum;  private String recharge_sum;  private String withdraw_sum;  private Integer child_sum;  private String balance;  private String fianl_amount;  private Integer is_machine;    public Integer getIs_machine()  {    return this.is_machine;  }    public void setIs_machine(Integer is_machine)  {    this.is_machine = is_machine;  }    public String getBalance()  {    return this.balance;  }    public void setBalance(String balance)  {    this.balance = balance;  }    public String getPlay_sum()  {    return this.play_sum;  }    public void setPlay_sum(String play_sum)  {    this.play_sum = play_sum;  }    public String getRecharge_sum()  {    return this.recharge_sum;  }    public void setRecharge_sum(String recharge_sum)  {    this.recharge_sum = recharge_sum;  }    public String getWithdraw_sum()  {    return this.withdraw_sum;  }    public void setWithdraw_sum(String withdraw_sum)  {    this.withdraw_sum = withdraw_sum;  }    public Integer getChild_sum()  {    return this.child_sum;  }    public void setChild_sum(Integer child_sum)  {    this.child_sum = child_sum;  }       public String getFianl_amount()  {    Double f = Double.valueOf(CommUtil.mul(this.amount, Double.valueOf(0.97D)));    return ""+f;  }    public void setFianl_amount(String fianl_amount)  {    this.fianl_amount = fianl_amount;  }    public Double getAll_eth()  {    return this.all_eth;  }    public void setAll_eth(Double all_eth)  {    this.all_eth = all_eth;  }    public String getStatus()  {    return this.status;  }    public void setStatus(String status)  {    this.status = status;  }    public Long getId()  {    return this.id;  }    public void setId(Long id)  {    this.id = id;  }    public String getUser_id()  {    return this.user_id;  }    public void setUser_id(String user_id)  {    this.user_id = user_id;  }    public String getAmount()  {    return this.amount;  }    public void setAmount(String amount)  {    this.amount = amount;  }    public String getType()  {    return this.type;  }    public void setType(String type)  {    this.type = type;  }    public Date getCtime()  {    return this.ctime;  }    public void setCtime(Date ctime)  {    this.ctime = ctime;  }}