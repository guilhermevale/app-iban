package app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Transaction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String userId;
    private Integer amount;
    private String transactionDate;
  
    /*
    Transaction(String userId, Integer amount, String transactionDate) {
		this.userId = userId;
		this.amount = amount;
		this.transactionDate = transactionDate;
	}*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
    
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
    
}

