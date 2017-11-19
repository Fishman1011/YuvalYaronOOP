/**
 * @author yaron samuel
 */

package ex0;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class wifiList {
	
	/*
	 * Time, ID, Lat, Lon, Alt, #WiFi networks (up to 10), SSID1, MAC1, Frequncy1, Signal1,
SSID2, MAC2, Frequncy2, Signal2, ...

	 */
	String id;
	String date;
	String time;
	double lat;
	double lon;
	double alt;
//	wifiPoint[] list; //������ ��� ���
	ArrayList<wifiPoint> points;

	public wifiList(String id, String date, String time, double lat, double lon, double alt, ArrayList<wifiPoint> points) {
		this.id = id;
		this.date = date;
		this.time = time;
		this.lat = lat;
		this.lon = lon;
		this.alt = alt;
//		this.list = list.clone();
		this.points = new ArrayList<wifiPoint>();
	}
	public wifiList(String id, String date, String time, double lat, double lon, double alt) {
		this.id =  new String(id);
		this.date = date;
		this.time = time;
		this.lat = lat;
		this.lon = lon;
		this.alt = alt;
//		this.list = new wifiPoint[10];
		this.points = new ArrayList<wifiPoint>();
	}
	
	public void wifiPointAdd(wifiPoint p) {
		points.add(p);
		points.sort( new sortSignal());
		while (points.size() > 10) {
			points.remove(10);
		}
	}
	
	@Override
	public String toString() {
		return "wifiList [id=" + id + ", date=" + date + ", time=" + time + ", lat=" + lat + ", lon=" + lon + ", alt="
				+ alt + ", points=" + Arrays.deepToString(points.toArray()) + "]";
	}



	
	
	/*public String toString() {
		String s =  "wifiList [id=" + id + ", date=" + date + ", time=" + time + ", lat=" + lat + ", lon=" + lon + ", alt="
				+ alt + "]\nlist=";
		 for (wifiPoint wifiPoint : list) {
			s += wifiPoint.toString();
			s+='\n';
		}
		 
		 return s;
	}*/
	
	
	

}
