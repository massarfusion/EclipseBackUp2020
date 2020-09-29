import java.io.IOException;
import java.io.RandomAccessFile;

public class Account {
	private String num;
	private String name;
	private String type;
	private String people;
	private double value;
	private String type2;
	public Account(){
	}
	public Account(String num, String name, String type, String people, double value){
		this.num=num;
		this.name=name;
		this.type=type;
		this.people=people;
		this.value=value;
		if(this.type.startsWith("a")) type2="家具";
		else if(this.type.startsWith("b")) type2="仪器";
		else if(this.type.startsWith("c")) type2="设备";
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		if(type.charAt(0)=='a') type2="家具";
		else if(type.charAt(0)=='b') type2="仪器";
		else if(type.charAt(0)=='c') type2="设备";
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public void write(RandomAccessFile raf) throws IOException{
		raf.writeUTF(num);
		raf.writeUTF(name);
		raf.writeUTF(type);
		raf.writeUTF(people);
		raf.writeDouble(value);
	}
	public void read(RandomAccessFile raf) throws IOException{
		this.num=raf.readUTF();
		this.name=raf.readUTF();
		this.type=raf.readUTF();
		this.people=raf.readUTF();
		this.value=raf.readDouble();
		if(this.type.startsWith("a")) type2="家具";
		else if(this.type.startsWith("b")) type2="仪器";
		else if(this.type.startsWith("c")) type2="设备";
	}
	@Override
	public String toString() {
		return "编号"+num+" 名称"+name+" 类型"+type2+" 保管人"+people+" 价值";
	}
}
