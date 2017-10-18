package lv.nixx.poc.patterns.creational.Builder;

import java.math.BigDecimal;

public class Transaction {
	
	private String id;
	private String account;
	private BigDecimal amount;
	private String currency;
	
	public String getId() {
		return id;
	}

	public String getAccount() {
		return account;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public static TransactionBuilder builder() {
		return new Transaction().new TransactionBuilder();
	}
	
	public class TransactionBuilder {
		
		private TransactionBuilder() {
		}
		
		TransactionBuilder withId(String id) {
			Transaction.this.id = id;
			return this;
		}
		
		TransactionBuilder withAccount(String account) {
			Transaction.this.account = account;
			return this;
		}

		TransactionBuilder withAmount(BigDecimal amount) {
			Transaction.this.amount = amount;
			return this;
		}

		TransactionBuilder withCurrency(String currency) {
			Transaction.this.currency = currency;
			return this;
		}

		
		Transaction build() {
			return Transaction.this;
		}
		
	}

}
