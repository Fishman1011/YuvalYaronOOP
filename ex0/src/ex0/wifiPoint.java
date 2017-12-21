package ex0;


public class wifiPoint {
	private String SSID;
	private  String MAC;
	private  int Signal;
	private  int Channel;
	

	/**
	 * Contractor of wifiPoint 
	 * @param SsSID
	 * @param SAC
	 * @param Signal
	 * @param Channel
	 */
	public wifiPoint(String SSID, String MAC, int Signal, int Channel) {
		this.SSID = SSID;
		this.MAC =MAC;
		this.Signal =Signal;
		this.Channel =Channel;
	}
	
	
	public wifiPoint(wifiPoint p) {
		this.SSID = p.SSID;
		this.MAC =p.MAC;
		this.Signal =p.Signal;
		this.Channel =p.Channel;
	}
	/**
	 * Print SSID, MAC, Signal and channel from wifiPoint
	 */
	@Override
	public String toString() {
		return "wifiPoint [SSID=" + SSID + ", MAC=" + MAC + ", Signal=" + Signal + ", Channel=" + Channel + "]";
	}
	/**
	 * Getter wifiPoint.ssid
	 * @return  ssid
	 */
	public String getSSID() {
		return SSID;
	}
	/**
	 * Getter wifiPoint.mac
	 * @return mac
	 */
	public String getMAC() {
		return MAC;
	}
	/**
	 * Getter wifiPoint.signal
	 * @return signal
	 */
	public int getSignal() {
		return Signal;
	}
	/**
	 * Getter wifiPoint.channel
	 * @return channel
	 */
	public int getChannel() {
		return Channel;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		wifiPoint other = (wifiPoint) obj;
		if (Channel != other.Channel)
			return false;
		if (MAC == null) {
			if (other.MAC != null)
				return false;
		} else if (!MAC.equals(other.MAC))
			return false;
		if (SSID == null) {
			if (other.SSID != null)
				return false;
		} else if (!SSID.equals(other.SSID))
			return false;
		if (Signal != other.Signal)
			return false;
		return true;
	}
	
	
}
