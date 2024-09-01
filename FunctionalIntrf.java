package LambdaExpression;
@FunctionalInterface
public interface FunctionalIntrf{
	void m1(); 
		default void m2() {
			
		}
		static void m3() {
	}
}
