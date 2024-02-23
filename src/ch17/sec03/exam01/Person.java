package ch17.sec03.exam01;

import java.util.Objects;

public class Person extends Object{
	long id;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id;
	}
	

	
	}
	
	
	

	
