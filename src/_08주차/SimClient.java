package _08주차;

public class SimClient implements Client {

	int id, arrivalTime = -1, startTime = -1, stoptime = -1;

	public SimClient(int id, int t) {
		// TODO Auto-generated constructor stub
		this.id = id;
		arrivalTime = t;
		System.out.println(this + " arrived at time " + t);
	}

	public int getStartTime() {
		return startTime;
	}

	public int getStoptime() {
		return stoptime;
	}

	@Override
	public void setStartTime(int t) {
		// TODO Auto-generated method stub
		this.startTime = t;
	}

	@Override
	public void setStopTime(int t) {
		// TODO Auto-generated method stub
		this.stoptime = t;
	}

	public String toString() {
		return "Client " + id;
	}

}
