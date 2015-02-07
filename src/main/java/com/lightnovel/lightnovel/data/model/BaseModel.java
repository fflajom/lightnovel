package com.lightnovel.lightnovel.data.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@MappedSuperclass
public abstract class BaseModel implements Serializable {    

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getClass().getSimpleName());
		sb.append("[id=");
		sb.append(id);
		sb.append("]");
	
		return sb.toString();
	}
	
	@Override
    public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;			
		if (getClass() != o.getClass()) return false;
		
		BaseModel other = (BaseModel) o;
		if (id == null && other.id != null) return false;
		
		return new EqualsBuilder().append(id, other.id).isEquals();
	}
	
	@Override
    public int hashCode() {
    	return new HashCodeBuilder().append(id).toHashCode();
    }
    
	public Long getId() {
		return id;
	}
	
}