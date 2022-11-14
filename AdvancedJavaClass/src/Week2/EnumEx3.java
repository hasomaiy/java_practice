package Week2;

enum PayRollDay{
	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);


	PayType payType;
	private PayRollDay(PayType payType) {this.payType = payType;}
	
	int compute(int minsWorked, int payRate) {
		return payType.pay(minsWorked, payRate);
	}

	enum PayType{
		WEEKDAY {
			int overTimePay(int minsWorked,int payRate) {
				return minsWorked <= MIN_PER_SHIFT ? 0 : 
					(minsWorked-MIN_PER_SHIFT) * payRate / 2;
			}
		},
		
		WEEKEND{
			int overTimePay(int minsWorked,int payRate) {
				return minsWorked * payRate/2;
			}
				
			};	
		
		abstract int overTimePay(int minsWorked,int payRate);
	
	
	static final int MIN_PER_SHIFT = 8 * 60;
	
	
	int pay(int minsWorked, int payRate) {
		int basePay = minsWorked * payRate;
		return basePay + overTimePay(minsWorked,payRate);
	}
}
}
	
public class EnumEx3 {

	public static void main(String[] args) {
		for (PayRollDay day:PayRollDay.values())
			System.out.println(day +"" +day.compute(8*60,1));
	}
}