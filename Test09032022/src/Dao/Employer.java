package Dao;

public class Employer {
              private String  name, password, email, country;
              private int id;
            public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public Employer() {
            	this.name = "";
				this.password = "";
				this.email = "";
				this.country = "";
            }
			public Employer(String name, String password, String email, String country) {
				super();
				this.name = name;
				this.password = password;
				this.email = email;
				this.country = country;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getCountry() {
				return country;
			}

			public void setCountry(String country) {
				this.country = country;
			}
			@Override
			public String toString() {
				return "Employer [name=" + name + ", password=" + password + ", email=" + email + ", country=" + country
						+ ", id=" + id + "]";
			}
              
            
}
