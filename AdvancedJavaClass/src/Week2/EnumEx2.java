package Week2;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumEx2 {
	
	private enum WeekDay{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}

	private static boolean isWorkingDay(Set<WeekDay> daySet, WeekDay day) {
		return daySet.contains(day);
	}
	
	public static void main(String[] args) {
		
		EnumSet<WeekDay> WeekDaySet = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		EnumSet<WeekDay> WeekEndSet = EnumSet.complementOf(WeekDaySet);
		
		Iterator<WeekDay> itr =  WeekDaySet.iterator();
//		Iterator<WeekDay> itr =  WeekEndSet.iterator();
		
		while (itr.hasNext()) {
			System.out.println("Day " + itr.next());
		}
		
		System.out.println("Need to work? " + isWorkingDay(WeekDaySet, WeekDay.MONDAY));
		System.out.println("Need to work? " + isWorkingDay(WeekDaySet, WeekDay.SUNDAY));
		

	}

}
