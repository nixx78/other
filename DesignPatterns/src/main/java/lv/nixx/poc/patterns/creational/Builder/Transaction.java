package lv.nixx.poc.patterns.creational.Builder;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Transaction {
	
	private String id;
	private String account;
	private BigDecimal amount;
	private String currency;

	public static TransactionBuilder builder() {
		return new Transaction().new TransactionBuilder();
	}
	
	public class TransactionBuilder {
		
		private TransactionBuilder() {
		}
		
		public TransactionBuilder withId(String id) {
			Transaction.this.id = id;
			return this;
		}

		public TransactionBuilder withAccount(String account) {
			Transaction.this.account = account;
			return this;
		}

		public TransactionBuilder withAmount(BigDecimal amount) {
			Transaction.this.amount = amount;
			return this;
		}

		public TransactionBuilder withCurrency(String currency) {
			Transaction.this.currency = currency;
			return this;
		}


		public Transaction build() {
			return Transaction.this;
		}
		
	}

}
