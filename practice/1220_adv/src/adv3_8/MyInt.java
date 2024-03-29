package adv3_8;

public class MyInt {
	private int data;
	public MyInt(int data){
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInt other = (MyInt) obj;
		if (data != other.data)
			return false;
		return true;
	}

}
