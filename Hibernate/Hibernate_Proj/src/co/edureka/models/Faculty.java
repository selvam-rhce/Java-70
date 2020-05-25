package co.edureka.models;

import java.util.Set;

public class Faculty {
	private Integer facid;
	private String facname;
	private Set<Batch> batches;

	public Faculty() {
	}

	public Faculty(Integer facid, String name) {
		this.facid = facid;
		this.facname = name;
	}

	public Integer getFacid() {
		return facid;
	}

	public void setFacid(Integer facid) {
		this.facid = facid;
	}

	public String getFacname() {
		return facname;
	}

	public void setFacname(String facname) {
		this.facname = facname;
	}
	
	public Set<Batch> getBatches() {
		return batches;
	}

	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
	
}
