package helper;



public class SNP {
	final String rsid;
	final String chromosome;
	final long position;
	final String genotype;
	public SNP(String rsid, String chromosome, long position, String genotype) {
		super();
		this.rsid = rsid;
		this.chromosome = chromosome;
		this.position = position;
		this.genotype = genotype;
	}
	
	/**
	 * @return the rsid
	 */
	String getRsid() {
		return rsid;
	}

	/**
	 * @return the chromosome
	 */
	String getChromosome() {
		return chromosome;
	}

	/**
	 * @return the position
	 */
	long getPosition() {
		return position;
	}

	/**
	 * @return the genotype
	 */
	String getGenotype() {
		return genotype;
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