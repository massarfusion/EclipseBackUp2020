package scanning;

public class Token {
	String name;
	String code;
	int addr;
	public Token(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	
	public Token(String name, String code, int addr) {
		super();
		this.name = name;
		this.code = code;
		this.addr = addr;
	}

	public void setAddr(int rcv) {
		this.addr=rcv;
	}
	//
}
