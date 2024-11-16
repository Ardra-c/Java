package oops.com.kod.abstraction;

public class BirdApp {
	public static void main(String[] args) {
		ForestBird forest = new ForestBird();
//		forest.acceptBird(new Eagle());
		forest.acceptBird(new GoldenEagle());
		forest.acceptBird(new SerpantEagle());
		forest.acceptBird(new MoutainEagle());
		
//		forest.acceptBird(new Sparrow());
		forest.acceptBird(new VegSparrow());
		forest.acceptBird(new NonvegSparrow());
	}
}
