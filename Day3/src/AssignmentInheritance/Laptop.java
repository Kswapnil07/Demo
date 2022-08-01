package AssignmentInheritance;


public class Laptop {

	int noOfUSBPort;
	float processorSpeed ;
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort=noOfUSBPort;
	}
	public float getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(float processorSpeed) {
		this.processorSpeed = processorSpeed;
		
	}
	public String toString () {
		return noOfUSBPort+" "+processorSpeed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Laptop l=new Laptop();
		
	l.setNoOfUSBPort(2);
	
	l.setProcessorSpeed(2.5f);
	
	System.out.println(l.getNoOfUSBPort()+" "+l.getProcessorSpeed());
			
		}
	}


