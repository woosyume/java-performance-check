
public class StringPerformance {

	public static void main(String[] args) {
		//stringPerformanceTest();
		stringBuilderPerformance();
		stringBuilderPerformance2();
	}
	
	private static void stringPerformanceTest() {
        String message = null;
        
        long start_time = System.currentTimeMillis();

        int count = 10000000;
        for (int i = 0; i < count; i++) {
        		message += "test test test test";
        }
        long end_time = System.currentTimeMillis();
        long difference = end_time-start_time;
        System.out.println("string=" + difference + "ms");
	}
	
	private static void stringBuilderPerformance() {
        StringBuilder message = new StringBuilder();
        
        long start_time = System.currentTimeMillis();

        int count = 10000000;
        for (int i = 0; i < count; i++) {
	    		message.append("test");
	    		message.append("test");
	    		message.append("test");
	    		message.append("test");
        }
        long end_time = System.currentTimeMillis();
        long difference = end_time-start_time;
        System.out.println("stringBuilderPerformance(append a)=" + difference + "ms");
	}
	
	private static void stringBuilderPerformance2() {
        StringBuilder message = new StringBuilder();
        
        long start_time = System.currentTimeMillis();

        int count = 10000000;
        for (int i = 0; i < count; i++) {
        		message.append("test" + "test" + "test" + "test");
        }
        long end_time = System.currentTimeMillis();
        long difference = end_time-start_time;
        System.out.println("stringBuilderPerformance(append a + b)=" + difference + "ms");
	}
}
