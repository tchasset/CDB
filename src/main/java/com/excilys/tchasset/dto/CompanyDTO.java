package com.excilys.tchasset.dto;

import org.springframework.stereotype.Component;

@Component
public class CompanyDTO {
	private String id;
	private String name;
	
	public static class Builder {
		private String id;
		private String name;
		
		public Builder setId(String id) {
			this.id = id;
			return this;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
        public CompanyDTO build() {
            return new CompanyDTO(this);
        }
    }
	
	public CompanyDTO() {}
	
	public CompanyDTO(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}