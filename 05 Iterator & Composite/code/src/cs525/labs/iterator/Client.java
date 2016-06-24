package cs525.labs.iterator;

public class Client {

	public static void main(String[] args) {

		Aggregate aggr = new NameRepository();
		Iterator itr = aggr.getIterator();
		Client client = new Client();

		Thread thread1 = new Thread(new Runnable() {
			public void run() {

				client.runTask();
				System.out.println("Thread1");
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			public void run() {

				client.runTask();
				System.out.println("Thread2");
			}
		});

		Thread thread3 = new Thread(new Runnable() {
			public void run() {
				client.runTask();
				System.out.println("Thread3");

			}
		});

		thread1.start();
		thread2.start();
		thread3.start();

	}

	public void runTask() {
		Aggregate aggr = new NameRepository();
		aggr.add("Tom6");
		aggr.delete("Jon2");
		Iterator itr = aggr.getIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
