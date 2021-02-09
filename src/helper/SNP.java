package helper;



public class SNP {
	 private String rsid;
	 private String chromosome;
	 private long position;
	 private String genotype;
	
	public SNP(String rsid, String chromosome, long position, String genotype) {
		super();
		this.rsid = rsid;
		this.chromosome = chromosome;
		this.position = position;
		this.genotype = genotype;
	}
	
	public SNP() {
		super();
	}

	public String getRsid() {
		return rsid;
	}

	public void setRsid(String rsid) {
		this.rsid = rsid;
	}

	public String getChromosome() {
		return chromosome;
	}

	public void setChromosome(String chromosome) {
		this.chromosome = chromosome;
	}

	public long getPosition() {
		return position;
	}

	public void setPosition(long position) {
		this.position = position;
	}

	public String getGenotype() {
		return genotype;
	}

	public void setGenotype(String genotype) {
		this.genotype = genotype;
	}

	@Override
	public int hashCode() {
		return 31 + rsid.hashCode() + genotype.hashCode();
	}
	@Override
	public boolean equals( Object other ) {
		if (this == other) return true;
		if ( other == null ) return false;
		if ( !(other instanceof SNP) ) return false;
		SNP otherSNP = (SNP)other;
		if ( !this.rsid.equals(otherSNP.rsid)   ) return false;
		if ( !this.genotype.equals(otherSNP.genotype)   ) return false;
		return true;
	}
	@Override
	public String toString() {
		return "SNP [rsid=" + rsid + ", chromosome=" + chromosome + ", position=" + position + ", genotype="
				+ genotype + "]";
	}
}