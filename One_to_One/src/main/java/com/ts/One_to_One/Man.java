package com.ts.One_to_One;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Man {
		@Id
		private String name;
		private int age;
		private String address;
		
		@OneToOne
		private Biomatric bio;
		
		public Biomatric getBio() {
			return bio;
		}
		public void setBio(Biomatric bio) {
			this.bio = bio;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Man() {}
		public Man(String name, int age, String address, Biomatric bio) {
		
			this.name = name;
			this.age = age;
			this.address = address;
			this.bio = bio;
		}
		
}
