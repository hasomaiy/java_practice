package Week8;



public class BuilderEx {

	int servingSize;
	int servings;
	int calories;
	int fat;
	int sodium;
	int carbohydrate;

	
	static class Builder{
		
		int servingSize;
		int servings;
		int calories=0;
		int fat=0;
		int sodium=0;
		int carbohydrate=0;
		
		public Builder(int servingSize,int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		Builder calories(int val) { this.calories = val; return this;}
		Builder fat(int val) { this.fat = val; return this;}
		Builder sodium(int val) { this.sodium = val; return this;}
		Builder carbohydrate(int val) { this.carbohydrate = val; return this;}
		
		
		BuilderEx build() {
			return new BuilderEx(this);
		}
		
	}
	
	BuilderEx(Builder builder){
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
		
		
		System.out.println("Serving Size = " + servingSize);
		System.out.println("Serving = " + servings);
		System.out.println("calories = " + calories);
		System.out.println("fat = " + fat);
		System.out.println("sodium = " + sodium);
		System.out.println("carbohydrate = " + carbohydrate);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BuilderEx obj = new BuilderEx.Builder(240,8).calories(100).sodium(35)
				.carbohydrate(27).build();

	}

}
