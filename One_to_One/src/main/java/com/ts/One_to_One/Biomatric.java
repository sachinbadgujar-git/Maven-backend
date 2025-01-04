package com.ts.One_to_One;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Biomatric {
		@Id
		private int bone;
		private String fingerprint;
		private int life;
		
		
		
		public int getBone() {
			return bone;
		}
		public void setBone(int bone) {
			this.bone = bone;
		}
		public String getFingerprint() {
			return fingerprint;
		}
		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}
		public int getLife() {
			return life;
		}
		public void setLife(int life) {
			this.life = life;
		}
		public Biomatric() {}
		public Biomatric(int bone, String fingerprint, int life) {
			
			this.bone = bone;
			this.fingerprint = fingerprint;
			this.life = life;
			
		}
		
		
}
