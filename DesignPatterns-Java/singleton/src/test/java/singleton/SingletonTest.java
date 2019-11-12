package singleton;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public abstract class SingletonTest<S> {
	private Supplier<S> singletonInstanceMethod;

	public SingletonTest(Supplier<S> singletonInstanceMethod) {
		this.singletonInstanceMethod = singletonInstanceMethod;
	}

	@Test
	public void testMultipleCallsReturnTheSameObjectInSameThread() {
		S inst1 = this.singletonInstanceMethod.get();
		S inst2 = this.singletonInstanceMethod.get();
		S inst3 = this.singletonInstanceMethod.get();
		Assertions.assertSame(inst1, inst2);
		Assertions.assertSame(inst1, inst3);
		Assertions.assertSame(inst2, inst3);
	}

	@Test
	public void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception {
		Assertions.assertTimeout(Duration.ofMillis(100000), () -> {
			List<Callable<S>> tasks = new ArrayList<>();
			for (int i = 0; i < 100000; i++) {
				tasks.add(this.singletonInstanceMethod::get);
			}

			// Use up to 10 concurrent threads to handle the tasks
			ExecutorService executorService = Executors.newFixedThreadPool(10);
			List<Future<S>> results = executorService.invokeAll(tasks);

			// wait for all of the threads to complete
			S expectedInst = this.singletonInstanceMethod.get();
			for (Future<S> res : results) {
				S inst = res.get();
				Assertions.assertNotNull(inst);
				Assertions.assertSame(expectedInst, inst);
			}
			executorService.shutdown();
		});

	}
}
