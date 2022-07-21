package com.advance.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DailyActivities {

	public static void main(String[] args) {
		ArrayList<String> urgentActivities=new ArrayList<>();
		ArrayList<String>relaxedActivities=new ArrayList<>();
		
		urgentActivities.add("Gaining knowledge ");	
		urgentActivities.add("implementing knowledge ");	
		
		relaxedActivities.add("playing games");
		relaxedActivities.add("watching video songs");
		relaxedActivities.add("sleeping");
		
		Collections.swap(urgentActivities, 1, 0);
		//urgentActivities.clear();
		
		System.out.println("urgent activities");
		for(String activities:urgentActivities) {
			System.out.println("-"+activities);
		}
		relaxedActivities.addAll(urgentActivities);
		Collections.sort(relaxedActivities);
		
		System.out.println("relaxed activities");
		for(String activities:relaxedActivities) {
			System.out.println("-"+activities);
		}
		System.out.println("---------------------------");
		if(relaxedActivities.contains("watching video songs")) {
			System.out.println("I watch pop songs");
			
			
		}
		System.out.println("---------------------------");
		System.out.println("important three elements");
		for(String activities:relaxedActivities.subList(0, 3)) {
			System.out.println("-"+activities);
		}
		Collections.shuffle(relaxedActivities);
		System.out.println("---------------------------");
		System.out.println("shuffled activites");
		for(String activities:relaxedActivities) {
			System.out.println("-"+activities);
		}


}
}
