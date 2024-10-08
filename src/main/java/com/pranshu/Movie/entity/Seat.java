package com.pranshu.Movie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Seat {
        @Id
	   private int seatId;
        private String type;
        private int totalseats;


		public Seat() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Seat(int seatId, String type, int totalseats) {
			super();
			this.seatId = seatId;
			this.type = type;
			this.totalseats = totalseats;
		}

		public int getSeatId() {
			return seatId;
		}

		public void setSeatId(int seatId) {
			this.seatId = seatId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getTotalseats() {
			return totalseats;
		}

		public void setTotalseats(int totalseats) {
			this.totalseats = totalseats;
		}

		@Override
		public String toString() {
			return "Seat [seatId=" + seatId + ", type=" + type + ", totalseats=" + totalseats + "]";
		}
        
        
}
