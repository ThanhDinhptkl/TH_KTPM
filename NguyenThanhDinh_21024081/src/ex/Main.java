package ex;

public class Main {
	public static void main(String[] args) {
		EagerInitializedSingleton singletonInstance = EagerInitializedSingleton.getInstance();
		System.out.println("EagerInitializedSingleton: " + singletonInstance.hashCode());
		StaticBlockSingleton singletonInstance1 = StaticBlockSingleton.getInstance();
		System.out.println("StaticBlockSingleton: " + singletonInstance1.hashCode());
		LazyInitializedSingleton singletonInstance2 = LazyInitializedSingleton.getInstance();
		System.out.println("LazyInitializedSingleton: " + singletonInstance2.hashCode());
	}
}
