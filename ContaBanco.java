package builderPattern;

public class ContaBanco {
	 	
		private long accountNumber;
	    private String owner;
	    private String branch;
	    private double balance;
	    private double interestRate;

	public static class Builder {
		private long n_conta; 
        private String nome;
        private String ramo;
        private double valor;
        private double juro;
                
        public Builder (long n_cont) {
        	this.n_conta = n_conta;
        }
        
        public Builder withNome(String nome) {
        	this.nome = nome;
        	
        	return this;
        }
        
        public Builder atRamo(String ramo) {
        	this.ramo = ramo;
        	
        	return this;
        }
        
        public Builder openingValor(double valor) {
        	this.valor = valor;
        	
        	return this;
        }
        
        public Builder atJuro(double juro) {
        	this.juro = juro;
        
        	return this;
        }
        
        public ContaBanco build() {
        	ContaBanco conta = new ContaBanco();
        	
        	conta.accountNumber = this.n_conta;
        	conta.owner = this.nome;
        	conta.branch = this.ramo;
        	conta.balance = this.valor;
        	conta.interestRate = this.juro;
        	
        	return conta;
        }

		public long getN_conta() {
			return n_conta;
		}

		public void setN_conta(long n_conta) {
			this.n_conta = n_conta;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRamo() {
			return ramo;
		}

		public void setRamo(String ramo) {
			this.ramo = ramo;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public double getJuro() {
			return juro;
		}

		public void setJuro(double juro) {
			this.juro = juro;
		}
        
	}
	
	private ContaBanco() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("ContaBanco [accountNumber=");
		builder2.append(accountNumber);
		builder2.append(", owner=");
		builder2.append(owner);
		builder2.append(", branch=");
		builder2.append(branch);
		builder2.append(", balance=");
		builder2.append(balance);
		builder2.append(", interestRate=");
		builder2.append(interestRate);
		builder2.append("]");
		return builder2.toString();
	}
	
	
}
